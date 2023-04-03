package com.google.controller;

import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet{

		public void service(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			System.out.println("SignUpController");
			
			String firstName=request.getParameter("firstName");
			String email=request.getParameter("email");
			String password=request.getParameter("password");
			
			System.out.println("firstName => "+firstName);
			System.out.println("email => "+email);
			System.out.println("password => "+password);

			
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
		
			out.print("<html><body>");
			StringBuffer error=new StringBuffer("");
			boolean isErr=false;
			
			if(firstName=="" || firstName.trim().length()==0) {
				isErr=true;
				error.append("<br>Please enter FirstName");
			}else if(firstName.trim().length()<=2)
			{
				isErr=true;
				error.append("<br>Please enter FirstName with more than 2 character");
			}
			else
			{
				String alpha="[a-zA-Z]+";
				if(firstName.matches(alpha)==false)
				{
					isErr=true;
					error.append("<br>Please enter valid FirstName");
				}
			}
			
			
			if(email=="" || email.trim().length()==0) {
				isErr=true;
				error.append("<br>Please enter Email");
			}
			else{
				String alpha="[a-z0-9_]+[@][a-z]{5}[/.][a-z]{0,3}";
				if(email.matches(alpha)==false)
				{
					isErr=true;
					error.append("<br>Please enter valid email_id");
				}
			}
			
			
			if(password=="" || password.trim().length()==0) {
				isErr=true;
				error.append("<br>Please enter Password");
			}
			
			
			
			if(isErr==true)
			{
				out.print("<span style='color:red;'>"+error+"</span>");
			}
			else {
				out.print("FirstName => "+firstName+"<br>");
				out.print("Email => "+email+"<br>");
				out.print("Password => "+password+"<br>");
			}
			out.print("</body></html>");
		}
}
