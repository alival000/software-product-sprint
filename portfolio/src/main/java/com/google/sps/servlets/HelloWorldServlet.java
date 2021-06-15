package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.google.gson.*;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    
    ArrayList<String> messages = new ArrayList<String>();
    messages.add("You are almost there!");
    messages.add("You can do it!");
    messages.add("Everyday is a new day.");
    messages.add("Good job!");
    
    String jsonMessages = new Gson().toJson(messages);

    response.setContentType("text/html;");
    response.getWriter().println(jsonMessages);
  }
}
