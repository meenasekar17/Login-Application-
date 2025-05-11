package com.nit.login;
import java.sql.*;
public class LoginDAO 
{
	AdminBean ab =null;
	
	public AdminBean view(String name)
	{
		try 
		{
			Connection con = DBConnection.getcon();
			PreparedStatement ps = con.prepareStatement("select * from admin where name=?");
			
			ps.setString(1, name);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				ab=new AdminBean();
			    ab.setName(rs.getString(1));
			    ab.setMail(rs.getString(2));
			    ab.setPno(rs.getLong(3));
				ab.setPwd(rs.getString(4));
				ab.setCpwd(rs.getString(5));
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ab;
	}

}
