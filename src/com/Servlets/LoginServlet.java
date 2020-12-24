package com.Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("uname");

		String pass = request.getParameter("pass");

		if (name.equals("kush25") && pass.equals("kush123")) {

			HttpSession session = request.getSession();
			session.setAttribute("username", name);

			response.sendRedirect("Dashboard.html");
		} else {

			response.getWriter().println("Error: Invalid Login Credentials");

		}

	}
}
