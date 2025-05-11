package com.nit.login;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/edit")
public class EditServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException 
    {
    	   ProductBean pb = new EditDAO().edit(req.getParameter("code"));
    	   System.out.println(pb);
    	   
    	   if(pb!=null)
    	   {
    		   req.setAttribute("pbean", pb); 
    		   req.getRequestDispatcher("editproduct.jsp").forward(req, res);
    	   }
    	
    }
    
}
