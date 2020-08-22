package com.maitstuk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/get_post_example")
public class SimpleServlet extends HttpServlet {

    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.getWriter().write("<html><body>Hello!<br>");
        String name =(String) request.getAttribute("name");
        if(name != null) {            
            response.getWriter().write(name);
        }
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("<html><body>Get!<br>");
        String yesOrNoParam = request.getParameter("param");

        if ("yes".equals(yesOrNoParam)) {
            response.getWriter().write("You said yes!</body></html>");
        }
        if ("no".equals(yesOrNoParam)) {
            response.getWriter().write("You said no!</body></html>");
        }     
        
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("<html><body>Post!<br>");
        String yesOrNoParam = request.getParameter("param");

        if ("yes".equals(yesOrNoParam)) {
            response.getWriter().write("You said yes!</body></html>");
        }
        if ("no".equals(yesOrNoParam)) {
            response.getWriter().write("You said no!</body></html>");
        }
        
        //We can read http headers
        String contentLength = request.getHeader("Content-Length");
        System.out.println(contentLength);
    }

}
