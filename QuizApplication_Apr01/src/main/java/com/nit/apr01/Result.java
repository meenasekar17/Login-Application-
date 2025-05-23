package com.nit.apr01;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@WebServlet("/display")
public class Result implements Servlet
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
            
		int currentScore = 0;
		int total =10;
		int wrongAns=0;
		String name = req.getParameter("uname");
		String roll = req.getParameter("roll");
		String one = req.getParameter("1");
		String two = req.getParameter("2");
		String three = req.getParameter("3");
		
		if(one.equalsIgnoreCase("java.util.date"))
			currentScore++;
	    else wrongAns++;
		if(two.equalsIgnoreCase("CallableStatment"))
			currentScore++;
		 else wrongAns++;
		if(three.equalsIgnoreCase("Setup() method"))
			currentScore++;
		else wrongAns++;

	    PrintWriter pw = res.getWriter();
	    pw.println(name+" "+roll);
	    
	    pw.println("user name : "+name);
	    pw.println("your score is : "+currentScore+"/"+total+" ");
		pw.println("wrong : "+wrongAns);
	}

}
