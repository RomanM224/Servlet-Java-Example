package com.maitstuk.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet_context")
public class ServletContextExample extends HttpServlet{

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      //creating ServletContext object  
        ServletContext context=getServletContext();  
          
        //Getting the value of the initialization parameter and printing it  
        String password = context.getInitParameter("password");  
        PrintWriter writer = response.getWriter();
        writer.println("driver name is="+password);  
    }
}
