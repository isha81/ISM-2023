package com.google.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet("/Form")

public class Form extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		
		boolean isErr=false;
		StringBuffer error=new StringBuffer("");
		
		
			if (firstName == null || firstName.trim().length() == 0) {
				isErr = true;
				error.append("<br>Please Enter FirstName");
			}

			if (lastName == null || lastName.trim().length() == 0) {
				isErr = true;
				error.append("<br>Please Enter LastName");
			}
			
			RequestDispatcher rd=null;
			
			if(isErr)
			{
				request.setAttribute("error", error.toString());
				rd=request.getRequestDispatcher("Form.jsp");
			}
			else
			{
				rd=request.getRequestDispatcher("Login.jsp");
			}

			rd.forward(request, response);
	}
	


}
