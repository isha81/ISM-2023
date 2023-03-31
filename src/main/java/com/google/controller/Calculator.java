package com.google.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)
	{
		String no1=request.getParameter("no1");
		String no2=request.getParameter("no2");
		
		String ans=request.getParameter("ans");
		int a=Integer.parseInt(no1);
		int b=Integer.parseInt(no2);
		
		if(ans.equals("add"))
		{
		 int ans1 =a+b;
		 System.out.println("Addition => "+ans1);
		}else if(ans.equals("sub"))
		{
			int ans1=a-b;
			System.out.println("Subtraction => "+ans1);
		}else if(ans.equals("mul"))
		{
			int ans1=a*b;
			System.out.println("Multiplication => "+ans1);
		}else if(ans.equals("div"))
		{
			int ans1=a/b;
			System.out.println("Division => "+ans1);
		}	
		
	}

}
