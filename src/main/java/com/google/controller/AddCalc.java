package com.google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddCalc extends HttpServlet{
	public void service(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("AddCalc");
		String no1=request.getParameter("no1");
		String no2=request.getParameter("no2");
		int a=Integer.parseInt(no1);
		int b=Integer.parseInt(no2);
		int ans=a+b;
		System.out.println(ans);
		
		
	}

}
