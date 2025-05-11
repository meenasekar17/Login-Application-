package com.nit.login;

import java.io.IOException;
import java.rmi.ServerException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Logout")
public class LogoutServlet extends HttpServlet
{
      protected void doGet(HttpServletRequest req ,HttpServletResponse res)throws ServerException ,IOException
      {
    	  HttpSession session = req.getSession(false); // Avoid creating a new session
          if (session != null) {
              session.invalidate(); // Invalidate the session
          }
          res.sendRedirect("Home.html"); // Redirect to login or homepage
    	  
      }
}
