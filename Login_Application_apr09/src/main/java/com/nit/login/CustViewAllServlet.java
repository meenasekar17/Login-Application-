package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/custview")
public class CustViewAllServlet extends GenericServlet 
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		List<ProductBean> li = new ViewAllDAO().view();
		 
        if(li!=null)
        {
       req.setAttribute("Pbean", li);
       req.getRequestDispatcher("custview.jsp").forward(req, res);
        }
        else
        {
       	 PrintWriter pw = res.getWriter();
       	 pw.println("invalid....");
        }
		
	}
	

}
