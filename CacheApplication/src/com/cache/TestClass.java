package com.cache;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
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
		//DBConnectivity obj = new DBConnectivity();
		HashMapStorage obj = new HashMapStorage(); 
		
		//obj.openconnection();
//		//obj.insert("a", "B");
		//List<String> keylist = new ArrayList<>();
		HashMap<String, String> keylist = new HashMap<>();
//		List<String> resultvaluelist = new ArrayList<>();
		keylist.put("A", "Akshit");
		keylist.put("B", "Abhinav");
		keylist.put("C", "Cow");		
		
		boolean resinsert = obj.insertCache(keylist);
		System.out.println(resinsert);
	
		

		HashMap<String, String> updateMap = new HashMap<>();
//		List<String> resultvaluelist = new ArrayList<>();
		//updateMap.put("A", "Akshit");
		updateMap.put("B", "Shrestha");
		updateMap.put("C", "Abhinav");
		boolean result = obj.updateCache(updateMap);
		if (result)
			System.out.println("updated the value");
		else
			System.out.println("not updated");
		//HashMapStorage obj = new HashMapStorage();
		
		List<String> lst1 = new ArrayList<>();
		//List<String> updateList = new ArrayList<>();
		//List<String> resultvaluelist = new ArrayList<>();
		lst1.add("C");
		lst1.add("B");
		boolean resremove = obj.removeCache(lst1);
		System.out.println(resremove);
		
		List<String> lst = new ArrayList<>();
		//List<String> updateList = new ArrayList<>();
		List<String> resultvaluelist = new ArrayList<>();
		lst.add("A");
		lst.add("B");
		lst.add("C");
		
		
		
		
		
		resultvaluelist = obj.readCache(lst);
		ListIterator<String> itr = resultvaluelist.listIterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
//		
//		//ListIterator<String> itr = keylist.listIterator();
//		//check
//		//resultvaluelist = obj.read(keylist);
//		ListIterator<String> itr = resultvaluelist.listIterator();
//		while (itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		/* To check the working of the remove function.
		boolean resultBool =  obj.remove(keylist);
		if (resultBool)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		*/
		
		//To check the working of the update function.
//		boolean resultBool =  obj.update("B", "Abhinav");
//		if (resultBool)
//		{
//			System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
		
		
		//To check the working of the insert function.
//				boolean resultBool =  obj.insert("C", "Shrestha");
//				if (resultBool)
//				{
//					System.out.println("true");
//				}
//				else
//				{
//					System.out.println("false");
//				}
//						
		
		
	}
	
	

}
