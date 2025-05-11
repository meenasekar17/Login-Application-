package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/custlogin")
@SuppressWarnings("serial")
public class CustomerLoginServlet extends HttpServlet
{
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		String name = req.getParameter("cname");
		String pwd = req.getParameter("pwd");
		
		CustomerBean cb = new CustomerDAO().login(name,pwd);
		System.out.println(cb);
		if(cb!=null)
		{
		if(pwd.equals(cb.getPwd()))
		{
			HttpSession hs = req.getSession();
			hs.setAttribute("cbean", cb);
			req.setAttribute("msg", "Customer Login successfully....");
			req.getRequestDispatcher("custloginsuccess.jsp").forward(req, res);
		}
		else {
			 PrintWriter pw = res.getWriter();	
			  pw.println("<div style='"
	   			   + "color: #721c24;"  // Dark red text
	   		        + "background-color: #f8d7da;"  // Soft light red background
	   		        + "border: 1px solid #f5c6cb;"  // Lighter border
	   		        + "padding: 16px 24px;"
	   		        + "border-radius: 10px;"
	   		        + "font-weight: 600;"
	   		        + "font-size: 17px;"
	   		        + "max-width: 500px;"
	   		        + "margin: 40px auto;"
	   		        + "text-align: center;"
	   		        + "font-family: Arial, sans-serif;"
	   		        + "box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);'>"
	   		        + "❌ Invalid password. Please try again."//text
	   		        + "</div>");
			  
			  req.getRequestDispatcher("clogin.html").include(req, res);

						
		}
		}
		else
		{
			 PrintWriter pw = res.getWriter();	
			  pw.println("<div style='"
	   			   + "color: #721c24;"  // Dark red text
	   		        + "background-color: #f8d7da;"  // Soft light red background
	   		        + "border: 1px solid #f5c6cb;"  // Lighter border
	   		        + "padding: 16px 24px;"
	   		        + "border-radius: 10px;"
	   		        + "font-weight: 600;"
	   		        + "font-size: 17px;"
	   		        + "max-width: 500px;"
	   		        + "margin: 40px auto;"
	   		        + "text-align: center;"
	   		        + "font-family: Arial, sans-serif;"
	   		        + "box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);'>"
	   		        + "❌ Invalid password. Please try again."//text
	   		        + "</div>");
			  
			  req.getRequestDispatcher("clogin.html").include(req, res);

		 
		}
	}

}
