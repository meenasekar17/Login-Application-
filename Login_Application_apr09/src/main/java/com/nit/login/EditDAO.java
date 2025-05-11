package com.nit.login;
import java.sql.*;
public class EditDAO 
{
	public ProductBean pb=null;
	
	public ProductBean edit(String code)
	{
		try 
		{
			Connection con = DBConnection.getcon();
			PreparedStatement ps = con.prepareStatement("select * from product12 where code= ?");
			 
			ps.setString(1, code);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				pb=new ProductBean();
				
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getFloat(3));
				pb.setStock(rs.getInt(4));
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pb;
	}

	public int k=0;
	public int update(String code, float price, int stock) 
	{
      try 
      {
    	  Connection con = DBConnection.getcon();
    	  PreparedStatement ps = con.prepareStatement("update product12 set price = ? ,stock = ? where code = ? ");
    	   
    	  ps.setFloat(1, price);
    	  ps.setInt(2, stock);
    	  ps.setString(3, code);
    	  
    	   k = ps.executeUpdate();
    	  
    	  
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }
	return k;

		
	}
	
	public int d =0 ;
	public int  delete(String code)
	{
		try 
	      {
	    	  Connection con = DBConnection.getcon();
	    	  PreparedStatement ps = con.prepareStatement("delete from product12 where code = ?");
	    	   
	    	 
	    	  ps.setString(1, code);
	    	  
	    	   d = ps.executeUpdate();
	    	  
	    	  
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }

		return d;
	}
	
	public int p=0;
	public int updateProduct(String code, int ubuy)
	{
		try 
	      {
	    	  Connection con = DBConnection.getcon();
	    	  PreparedStatement ps = con.prepareStatement("update product12  set stock = stock - ? where code = ? ");
		        
	    	   ps.setInt(1, ubuy);
	    	   ps.setString(2, code);
	    	   
	    	    p = ps.executeUpdate();
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return p;
		
	}
}
	
