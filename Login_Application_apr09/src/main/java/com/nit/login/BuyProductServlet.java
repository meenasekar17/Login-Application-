package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/buyproduct")
public class BuyProductServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		String code = req.getParameter("code");
		float price = Float.parseFloat(req.getParameter("price"));
		 int ubuy = Integer.parseInt(req.getParameter("ubuy"));
		 int stock = Integer.parseInt(req.getParameter("stock"));
		 float total = ubuy*price;
		 if(stock>=ubuy)
		 {
		        ProductBean pb = new EditDAO().edit(code);
		       
		     
		      if(pb!=null)
		      {
		    	  req.setAttribute("pbean", pb);
		    	  req.setAttribute("ubuy", ubuy);
		    	  req.setAttribute("total", total);
		    	  req.getRequestDispatcher("bill.jsp").forward(req, res);
//		    	  req.setAttribute("msg", "you Have Purchased Product Successfully.....<br>");
//				  req.getRequestDispatcher("buysuccess.jsp").forward(req, res);
		      }
		 }
		 else 
		 {
			 PrintWriter pw = res.getWriter();
			
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
				        + "You entered more than the available stock!"
				        + "</div>");
			 ProductBean pb = new EditDAO().edit(code);
			 req.setAttribute("pbean", pb);
			   req.getRequestDispatcher("buyproduct.jsp").include(req, res);
		 }
	}
    
		
}
