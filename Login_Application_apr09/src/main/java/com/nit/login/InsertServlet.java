package com.nit.login;

import java.io.IOException;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class InsertServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
       ProductBean pb =new ProductBean();
       
       pb.setCode(req.getParameter("code"));
      pb.setName( req.getParameter("name"));
      pb.setPrice(Float.parseFloat(req.getParameter("price")));
      pb.setStock(Integer.parseInt(req.getParameter("stock")));
  
          int k = new InsertDAO().insert(pb);
          
          if(k>0)
          {
        	  req.setAttribute("msg", pb);
        	  req.getRequestDispatcher("addproductsuccess.jsp").forward(req, res);
        	  
          }
          else
          {
        	  
          }
		 
	}

}
