package com.maitstuk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session_example2")
public class SessionExample2 extends HttpServlet{
    
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String name = (String) session.getAttribute("name");
        response.getWriter().write("<html><body>Hello!<br>" + name+ "<br>");
        response.getWriter().write("<a href=\"/servlet_1/session_example\">Session example1</a><br>");
        response.getWriter().write("<a href=\"/servlet_1/home.html\">Home</a>");
        System.out.println(session.getId());
        
        //Close Session
//        HttpSession session = request.getSession(false);
//        if (session != null) {
//            session.invalidate();
//        }
        
    }
}
