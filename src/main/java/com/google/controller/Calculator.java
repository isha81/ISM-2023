package com.google.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException{
	
		String no1=request.getParameter("no1");
		String no2=request.getParameter("no2");
		
		String ans=request.getParameter("ans");
		int a=Integer.parseInt(no1);
		int b=Integer.parseInt(no2);
		int ans1=0;
		if(ans.equals("add"))
		{
		  ans1 =a+b;
		 System.out.println("Addition => "+ans1);
		}else if(ans.equals("sub"))
		{
			 ans1=a-b;
			System.out.println("Subtraction => "+ans1);
		}else if(ans.equals("mul"))
		{
			ans1=a*b;
			System.out.println("Multiplication => "+ans1);
		}else if(ans.equals("div"))
		{
			ans1=a/b;
			System.out.println("Division => "+ans1);
		}	
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		
		
		if(ans.equals("add")) {
			out.print(no1 +" + "+ no2+"= "+ans1);
		}
		else if(ans.equals("sub")) {
			out.print(no1 +" - "+ no2+"= "+ans1);
		}
		else if(ans.equals("mul")) {
			out.print(no1 +" * "+ no2+"= "+ans1);
		}
		else if(ans.equals("div")) {
			out.print(no1 +" / "+ no2+"= "+ans1);
		}
		out.print("</body></html>");
		
	}

}
