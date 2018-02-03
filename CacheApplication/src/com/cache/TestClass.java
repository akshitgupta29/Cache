package com.cache;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestClass {

	public static void main(String[] args) 
	{
		 // Create a variable for the connection string.  
	      //String connectionUrl = "jdbc:oracle:thin:@localhost:1521:xe", "akshit", "akshit";  

	      // Declare the JDBC objects.  
	      /*Connection con = null;  
	      Statement stmt = null;  
	      ResultSet rs = null;  

	      try {  
	         // Establish the connection.  
	         Class.forName("com.mysql.jdbc.Driver");  
	         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cache", "root","akshit");  

	         // Create and execute an SQL statement that returns some data.  
	         String SQL = "SELECT * FROM cachedata";  
	         stmt = con.createStatement();  
	         rs = stmt.executeQuery(SQL);  

	         // Iterate through the data in the result set and display it.  
	         while (rs.next()) {  
	            System.out.println(rs.getString(1));  
	         }  
	      }  

	      // Handle any errors that may have occurred.  
	      catch (Exception e) {  
	         e.printStackTrace();  
	      }  
	      finally {  
	         if (rs != null) try { rs.close(); } catch(Exception e) {}  
	         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
	         if (con != null) try { con.close(); } catch(Exception e) {}  
	      } */
		DBConnectivity obj = new DBConnectivity();
		
		obj.openconnection();
		//obj.insert("a", "B");
		List<String> keylist = new ArrayList<>();
		List<String> resultvaluelist = new ArrayList<>();
		keylist.add("A");
		keylist.add("B");
		resultvaluelist = obj.read(keylist);
		ListIterator<String> itr = resultvaluelist.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
