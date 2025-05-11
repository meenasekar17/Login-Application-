package com.nit.login;
import java.sql.*;
public class InsertDAO 
{
   public int k=0;
   
   public int insert(ProductBean pb)
   {
	   try
	   {
		   Connection con = DBConnection.getcon();
		   PreparedStatement ps = con.prepareStatement("insert into product12 values(?,?,?,?)");
		   
		   ps.setString(1, pb.getCode());
		   ps.setString(2, pb.getName());
		   ps.setFloat(3, pb.getPrice());
		   ps.setInt(4, pb.getStock());
		   
		    k = ps.executeUpdate();
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   return k;
   }
}
