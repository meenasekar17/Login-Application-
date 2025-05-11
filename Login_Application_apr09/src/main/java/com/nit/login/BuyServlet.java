package com.nit.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/buy")
@SuppressWarnings("serial")
public class BuyServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
		 ProductBean pb = new EditDAO().edit(req.getParameter("code"));
  	       System.out.println(pb);
  	   
  	   if(pb!=null)
  	   {
  		   req.setAttribute("pbean", pb); 
  		   req.getRequestDispatcher("buyproduct.jsp").forward(req, res);
  	   }
    }
}
