package com.nit.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteCheckServlet extends HttpServlet
{
      protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
      {
    	   int k = new EditDAO().delete(req.getParameter("code"));
    	  System.out.println(k);
    	  if(k>0)
    	  {
    		  req.setAttribute("msg","Product Deleted Successfully....<br>");
    		  req.getRequestDispatcher("Delete.jsp").forward(req, res);
    	  }
    	  else
    	  {
    		  PrintWriter pw = res.getWriter();
    		  pw.println("Invalid Code....");
    	  }
      }
}
