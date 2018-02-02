package com.cache;

import java.util.List;

public class FileConnectivity implements Store
{
	void CreateFile()
	{
		//File = new File
	}



	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub
		
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
