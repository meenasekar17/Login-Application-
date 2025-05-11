package com.nit.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/payment")
public class PaymentServlet extends HttpServlet 
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String code = req.getParameter("code");
		int ubuy = Integer.parseInt(req.getParameter("ubuy"));
		
		int p = new EditDAO().updateProduct(code, ubuy);
		if(p>0)
		{
			 req.setAttribute("msg", "you Have Purchased Product Successfully.....<br>");
			  req.getRequestDispatcher("buysuccess.jsp").forward(req, res);
		}
		else
		{
			
		}
	}
	
}
