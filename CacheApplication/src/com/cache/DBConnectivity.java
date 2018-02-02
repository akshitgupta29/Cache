package com.cache;
import java.util.List;
import java.util.Map;

public  class DBConnectivity implements Store
{
	void connectivity()
	 {
		 System.out.print("HI");
	 }

	@Override
	public void read(List<String> key) {
		// TODO Auto-generated method stub
		System.out.println("in DB READ");
		
	}

	@Override
	public void remove(List<String> key) {
		// TODO Auto-generated method stub
		System.out.println("in DB remove");
		
	}

	@Override
	public void insert(String key, String value) {
		System.out.println("in DB insert");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String key, String value) {
		// TODO Auto-generated method stub
		System.out.println("in DB update");
		
	}


	@Override
	public void connection() {
		// TODO Auto-generated method stub
		System.out.println("in DB connect");
		
	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		System.out.println("in DB close");
		
	}

	@Override
	public boolean openconnection() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insert(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> read(List<String> key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean update(String key, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(List<String> key) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}

