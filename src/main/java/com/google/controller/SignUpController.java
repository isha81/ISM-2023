package com.google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet{

		public void service(HttpServletRequest request, HttpServletResponse response)
		{
			System.out.println("SignUpController");
			
			String firstName=request.getParameter("firstName");
			String lastName=request.getParameter("lastName");
			String password=request.getParameter("password");
			
			System.out.println("firstName => "+firstName);
			System.out.println("lastName => "+lastName);
			System.out.println("password => "+password);
			
		}
}
