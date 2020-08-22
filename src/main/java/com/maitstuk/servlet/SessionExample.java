package com.maitstuk.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session_example")
public class SessionExample extends HttpServlet {
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("param");
		if(name != null) {
		    HttpSession session = request.getSession();
	        session.setAttribute("name", name);
	        response.getWriter().write("<html><body>Hello!<br>" + name);
	        response.getWriter().write("<a href=\"/servlet_1/session_example2\">Click here</a>");
//	        RequestDispatcher rd = getServletContext().getRequestDispatcher("/session_example2");
//	        rd.forward(request, response);
	        System.out.println(session.getId());
		}else {
		     HttpSession session = request.getSession();
		     name = (String) session.getAttribute("name");
		     response.getWriter().write("<html><body>Hello!<br>" + name + "<br>");
	         response.getWriter().write("<a href=\"/servlet_1/session_example2\">Session Example2</a>");
	         System.out.println(session.getId());
		}
		
		
	}

}
