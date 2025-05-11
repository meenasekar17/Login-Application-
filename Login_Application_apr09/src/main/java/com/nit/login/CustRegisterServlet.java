package com.nit.login;



import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/cregister")
@SuppressWarnings("serial")
public class CustRegisterServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		CustomerBean cb = new CustomerBean();
		res.setContentType("text/html");
		 PrintWriter pw=res.getWriter();
		cb.setUname(req.getParameter("uname"));
		cb.setPwd(req.getParameter("pwd"));
		cb.setFname(req.getParameter("fname"));
		cb.setLname(req.getParameter("lname"));
		cb.setMid(req.getParameter("mid"));
		cb.setPhno(Long.parseLong(req.getParameter("pno")));
		
		int k = new CustomerDAO().insert(cb);
		
		if(k>0)
		{
			pw.println("<h1>Customer Registered Successfully...</h1><br>");
			req.getRequestDispatcher("clogin.html").include(req, res);
		}
	}
	

}
