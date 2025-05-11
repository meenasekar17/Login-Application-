package com.nit.login;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewAllServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
         List<ProductBean> li = new ViewAllDAO().view();
         if(li!=null)
         {
        req.setAttribute("Pbean", li);
        req.getRequestDispatcher("view.jsp").forward(req, res);
         }
		
	}

}
