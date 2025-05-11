package com.nit.login;
import java.sql.*;
import java.util.*;
public class ViewAllDAO
{
	public ProductBean pb =null;
	
	public List<ProductBean> view()
	{
		List<ProductBean> li = new ArrayList<ProductBean>();
		
		try
		{
			Connection con = DBConnection.getcon();
			PreparedStatement ps = con.prepareStatement("select * from product12");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				pb= new ProductBean();
				pb.setCode(rs.getString(1));
				pb.setName(rs.getString(2));
				pb.setPrice(rs.getFloat(3));
				pb.setStock(rs.getInt(4));
				
				li.add(pb);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return li;
	}

}
