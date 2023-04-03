package com.google.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")

public class Registration extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String confirmPassword=request.getParameter("confirmpassword");
		String gender=request.getParameter("gender");
		String hobbies=request.getParameter("hobbies");
		String city=request.getParameter("city");
		
		System.out.println("FirstName =>"+firstName);
		System.out.println("LastName =>"+lastName);
		System.out.println("Email =>"+email);
		System.out.println("Password =>"+password);
		System.out.println("Confirm-Password =>"+confirmPassword);
		System.out.println("Gender =>"+gender);
		System.out.println("Hobbies =>"+hobbies);
		System.out.println("City =>"+city);
		
		boolean isError=false;
		StringBuffer error=new StringBuffer("");
		
		if(firstName==""||firstName.trim().length()==0){
			isError=true;
			error.append("Please enter firstName<br>");			
		}else if(firstName.length()<=2)
		{
			isError=true;
			error.append("Please enter firstName with more than 2 characters<br>");
		}
		else
		{
			String alpha="[a-zA-Z]+";
			if(firstName.matches(alpha)==false)
			{
				isError=true;
				error.append("Please enter valid FirstName<br>");
			}
		}
		
		
		if(lastName==""||lastName.trim().length()==0){
			isError=true;
			error.append("Please enter LastName<br>");			
		}else if(lastName.length()<=2)
		{
			isError=true;
			error.append("Please enter lastName with more than 2 characters<br>");
		}
		else
		{
			String alpha="[a-zA-Z]+";
			if(lastName.matches(alpha)==false)
			{
				isError=true;
				error.append("Please enter valid LastName<br>");
			}
		}
		
		if(email==""||email.trim().length()==0){
			isError=true;
			error.append("Please enter Email<br>");			
		}
		else
		{
			String alpha="[a-z0-9_]+[@][a-z]{5}[/.][a-z]{0,3}";
			if(email.matches(alpha)==false)
			{
				isError=true;
				error.append("Please enter valid Email<br>");
			}
		}
		
		if(password==""||password.trim().length()==0)
		{
			isError=true;
			error.append("Please enter password<br>");
		}
		
		if(confirmPassword==""||confirmPassword.trim().length()==0)
		{
			isError=true;
			error.append("Please enter password<br>");
		}
		else if(confirmPassword.equals(password)==false)
		{
			isError=true;
			error.append("Please check the password<br>");
		}
		
		if(gender==null)
		{
			isError=true;
			error.append("Please enter gender<br>");
			
		}
		
		
		if(city=="")
		{
			isError=true;
			error.append("Please select city<br>");
		}
		
		
		RequestDispatcher rd=null;
		if(isError==true)
		{
			request.setAttribute("error",error.toString());
			rd=request.getRequestDispatcher("Registration.jsp");
		}else
		{
			rd=request.getRequestDispatcher("Login.jsp");
		}
		
		rd.forward(request, response);
	}

}
