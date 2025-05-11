package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/register")

public class RegisterServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		
		
		AdminBean ab = new AdminBean();
		 res.setContentType("text/html");
		 PrintWriter pw=res.getWriter();
		ab.setName(req.getParameter("fname"));
		ab.setMail(req.getParameter("mid"));
		ab.setPno(Long.parseLong(req.getParameter("pno")));
		ab.setPwd(req.getParameter("rpwd"));
		ab.setCpwd(req.getParameter("cpwd"));
		
	    String p1 = req.getParameter("rpwd");
	    String p2 = req.getParameter("cpwd");
		
		
		
		
		int k = new RegisterDAO().insert(ab);
		if(p1.equals(p2))
		{
		if(k>0)
		{
			 
				
			 pw.println("<div style='"
				        + "color: #721c24;"
				        + "background-color: #f8d7da;"
				        + "border: 1px solid #f5c6cb;"
				        + "padding: 12px 20px;"
				        + "border-radius: 8px;"
				        + "font-weight: bold;"
				        + "font-size: 16px;"
				        + "max-width: 400px;"
				        + "margin: 20px auto;"
				        + "text-align: center;"
				        + "box-shadow: 0 2px 5px rgba(0,0,0,0.1);'>"
				        + "Registered Successfully..."
				        + "</div>");
			
			req.getRequestDispatcher("login.html").include(req, res);
		}
		else 
		{
			pw.println("<div style='"
			        + "color: #721c24;"  // Dark red text color
			        + "background-color: #f8d7da;"  // Soft light red background
			        + "border: 1px solid #f5c6cb;"  // Lighter border for subtle emphasis
			        + "padding: 16px 24px;"
			        + "border-radius: 8px;"
			        + "font-weight: 600;"
			        + "font-size: 18px;"
			        + "text-align: center;"
			        + "font-family: Arial, sans-serif;"
			        + "box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);"
			        + "max-width: 600px;"
			        + "margin: 40px auto;'>"  
			        + "❌ Registration Failed. Please try again!"
			        + "</div>");

			pw.println("<style>"
			        + "body { font-family: Arial, sans-serif; background-color: #f4f4f4; margin: 0; padding: 0; }"
			        + ".btn {"
			        + "  display: inline-block;"
			        + "  padding: 12px 24px;"
			        + "  background-color: #007bff;"
			        + "  color: white;"
			        + "  text-decoration: none;"
			        + "  border-radius: 5px;"
			        + "  font-size: 16px;"
			        + "  cursor: pointer;"
			        + "  margin-top: 20px;"
			        + "  transition: background-color 0.3s ease;"
			        + "}"
			        + ".btn:hover { background-color: #0056b3; }"
			        + "</style>");

			// Include the register.html form below the message
			req.getRequestDispatcher("register.html").include(req, res);
			
		}
		}
		else
		{
			

			pw.println("<div style='"
			        + "color: #721c24;"  // Dark red text color for error message
			        + "background-color: #f8d7da;"  // Soft light red background
			        + "border: 1px solid #f5c6cb;"  // Light border for subtle emphasis
			        + "padding: 16px 24px;"
			        + "border-radius: 8px;"
			        + "font-weight: 600;"
			        + "font-size: 18px;"
			        + "text-align: center;"
			        + "font-family: Arial, sans-serif;"
			        + "box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);"
			        + "max-width: 600px;"
			        + "margin: 40px auto;'>"
			        + "❌ Passwords do not match. Please try again."
			        + "</div>");
			
			req.getRequestDispatcher("register.html").include(req, res);

		}
		
	}
}
