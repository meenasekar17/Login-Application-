package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/insert")
public class LoginServlet extends HttpServlet
{

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		PrintWriter pw = res.getWriter();
		 res.setContentType("text/html");

	    String name = req.getParameter("ename");
	    String pwd = req.getParameter("pwrd");
	    AdminBean ab = new LoginDAO().view(name);
	    
	    if(ab==null) 
	    {
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
	    		        + " -> Invalid Login Process.please Register Now"//text
	    		        + "</div>");
	         	
	            req.getRequestDispatcher("login.html").include(req, res);
	    	
	       
	    }
	    else
	    {
	    	
	       if(pwd.equalsIgnoreCase(ab.getPwd()))
	      {
	    	HttpSession hs = req.getSession();
	    	System.out.println(ab);
	    	hs.setAttribute("abean", ab);
	         req.setAttribute("msg",name);
	    	 req.getRequestDispatcher("loginsuccess.jsp").forward(req, res);
	      }
	       else
	       {
	    	   
	    	  

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
	         	
	            req.getRequestDispatcher("login.html").include(req, res);
	       }
	    
	    
	    } 
	    
	}
	
}
