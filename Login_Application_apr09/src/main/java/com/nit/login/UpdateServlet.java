package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String code = req.getParameter("code");
		float price = Float.parseFloat(req.getParameter("price"));
		  int stock = Integer.parseInt(req.getParameter("stock"));
		  
		  
		  int k = new EditDAO().update(code,price,stock);
		  
		  if(k>0)
		  {
			  req.setAttribute("msg", "Product Updated Successfully.....<br>");
			  req.getRequestDispatcher("updatesuccess.jsp").forward(req, res);
		  }
		  else
		  {
			  PrintWriter pw = res.getWriter();
			  pw.println("Does Not Updated .....");
		  }
	}
}
