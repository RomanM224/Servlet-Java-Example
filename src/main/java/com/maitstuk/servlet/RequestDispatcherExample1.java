package com.maitstuk.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/request_dispatcher_1")
public class RequestDispatcherExample1 extends HttpServlet{
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String name = request.getParameter("name");
        System.out.println("RequestDispatcher1 getParameter: " + name);
        name = "Maistruks " + name;
        request.setAttribute("name", name);
        //If we use include(...), "RequestDispatcherExample1" will be written
        request.getRequestDispatcher("/request_dispatcher_2").include(request, response);
        response.getWriter().write("RequestDispatcherExample1");
        //If we use forward(...), "RequestDispatcherExample1" will not be written
        //request.getRequestDispatcher("/request_dispatcher_2").forward(request, response);

    }

}
