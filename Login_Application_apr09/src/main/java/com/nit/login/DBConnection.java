package com.nit.login;
import java.sql.*;


public class DBConnection 
{
	public static Connection con = null;

	private DBConnection() 
	{
		super();
	}
	
	
	static 
	{
		try
		{
			Class.forName(DBinfo.driver);
			con=DriverManager.getConnection(DBinfo.url, DBinfo.username, DBinfo.pwd);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static Connection getcon()
	{
		return con;
	}
}
