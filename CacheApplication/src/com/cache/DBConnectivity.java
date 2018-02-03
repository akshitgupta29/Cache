package com.cache;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public  class DBConnectivity implements Store
{
	Connection con = null;
	PreparedStatement stmt = null;
	ResultSet rs = null;
	@Override
	public void closeConnection() 
	{
		// TODO Auto-generated method stub
		// System.out.println("in DB close");
		try 
		{
			con.close();
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean openconnection() 
	{
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cache", "root","akshit");
		} catch (Exception e) 
		{
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean insert(String key, String value) 
	{
		// TODO Auto-generated method stub
		int flag = 0;
		String skey = key ;
		String svalue = value;
			try
			{
				String query = "insert into cachedata values (?, ?);";
				stmt = con.prepareStatement(query);
				stmt.setString(2, svalue);
				stmt.setString(1, skey);
				flag = stmt.executeUpdate();
				
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			if (flag == 0)
			{
				System.out.println(skey + " index value is not inserted with " + svalue);
				return false;
			}
			if (flag==1)
			{
				System.out.println(skey + " index value is inserted with " + svalue);
			}
		return true;
		
	}

	@Override
	public List<String> read(List<String> key) 
	{
		// TODO Auto-generated method stub
		List<String> resultList = new ArrayList<String>();
		ListIterator<String> itr = key.listIterator();
		while (itr.hasNext()) //while the iterator has next available value
		{
			String s1 = itr.next();
			try
			{
				String query = "select * from cachedata where keyfig = ?";
				stmt = con.prepareStatement(query);
				stmt.setString(1, s1);
				rs = stmt.executeQuery();
				while (rs.next())
				{
					resultList.add(rs.getString(2));
				}
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		return resultList;
	}

	@Override
	public boolean update(String key, String value) 
	{
		// TODO Auto-generated method stub
		int flag = 0;
		String skey = key ;
		String svalue = value;
			try
			{
				String query = "update cachedata set valuefig = ? where keyfig = ?";
				stmt = con.prepareStatement(query);
				stmt.setString(1, svalue);
				stmt.setString(2, skey);
				flag = stmt.executeUpdate();
				
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			if (flag == 0)
			{
				System.out.println(skey + " index value is not updated with " + svalue);
				return false;
			}
			if (flag==1)
			{
				System.out.println(skey + " index value is updated with " + svalue);
			}
		return true;
	}

	@Override
	public boolean remove(List<String> key) 
	{
		// TODO Auto-generated method stub
		int flag = 0;
		//List<String> resultList = new ArrayList<String>();
		ListIterator<String> itr = key.listIterator();
		while (itr.hasNext()) //while the iterator has next available value
		{
			String s1 = itr.next();
			try
			{
				String query = "delete from cachedata where keyfig = ?";
				stmt = con.prepareStatement(query);
				stmt.setString(1, s1);
				flag = stmt.executeUpdate();
				
			}
			catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
			}
			if (flag == 0)
			{
				System.out.println(s1 + " index value is not deleted");
				return false;
			}
			if (flag==1)
			{
				System.out.println(s1 + " index value has been deleted");
			}
		}
		return true;
	}
	
	
	
}

