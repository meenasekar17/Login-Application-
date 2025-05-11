package com.nit.login;
import java.sql.*;
public class RegisterDAO 
{
     public int k=0;
     
     public int insert(AdminBean ab)
     {
    	 try
    	 {
    		Connection con = DBConnection.getcon(); 
    		PreparedStatement ps = con.prepareStatement("insert into admin values (?,?,?,?,?)");
    		
    		ps.setString(1, ab.getName());
    		ps.setString(2, ab.getMail());
    		ps.setLong(3, ab.getPno());
    		ps.setString(4, ab.getPwd());
    		ps.setString(5, ab.getCpwd());
    		
    		 k = ps.executeUpdate();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 
    	 return k;
     }
}
