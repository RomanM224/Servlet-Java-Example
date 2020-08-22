package com.maitstuk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request_dispatcher_2")
public class RequestDispatcherExample2 extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.getWriter().write("RequestDispatcherExample2");
        String name = (String) request.getAttribute("name");
        System.out.println("RequestDispatcher2 getAttribute: " + name);
        name = request.getParameter("name");
        System.out.println("RequestDispatcher2 getParameter: " + name);
    }

}
