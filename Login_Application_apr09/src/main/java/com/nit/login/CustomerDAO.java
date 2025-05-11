package com.nit.login;
import java.sql.*;
public class CustomerDAO 
{
    public int k=0;
    
    public int insert(CustomerBean cb)
    {
    	try
    	{
    		Connection con = DBConnection.getcon();
    		PreparedStatement ps = con.prepareStatement("insert into customer values (?,?,?,?,?,?)");
    		
    		ps.setString(1, cb.getUname());
    		ps.setString(2, cb.getPwd());
    		ps.setString(3, cb.getFname());
    		ps.setString(4, cb.getLname());
    		ps.setString(5, cb.getMid());
    		ps.setLong(6,cb.getPhno());
    		
    		 k = ps.executeUpdate();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	return k;
    }

    
    public CustomerBean cb = null;
	public CustomerBean login(String name, String pwd) 
	{
		try
    	{
    		Connection con = DBConnection.getcon();
    		PreparedStatement ps = con.prepareStatement("select * from customer where username = ? and pwd = ? ");
    		
    		ps.setString(1, name);
    		ps.setString(2, pwd); 
    		
    		ResultSet rs = ps.executeQuery();
    		
    		if(rs.next())
    		{
    			cb=new CustomerBean();
    			cb.setUname(rs.getString(1));
    			cb.setPwd(rs.getString(2));
    			cb.setFname(rs.getString(3));
    			cb.setLname(rs.getString(4));
    			cb.setMid(rs.getString(5));
    			cb.setPhno(rs.getLong(6));
    		}
    	}
		catch(Exception e)
		{
		   e.printStackTrace();	
		}
		return cb;
		
		
	}
}
