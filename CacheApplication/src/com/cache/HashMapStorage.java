package com.cache;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapStorage implements Cache, CacheUtil 
{
	Map<String, String> map = new HashMap<>();
	
	//we can ask user where it wants to store
	//if else
	Store storedbobj = new DBConnectivity();
	Store storefileobj = new FileConnectivity();
		
	
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sizeOf() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void encryptData(List<String> lst) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean range() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> readCache(List<String> lst) 
	{
		List<String> resultList = new ArrayList<String>();
		ListIterator<String> itr = lst.listIterator();
		while (itr.hasNext()) //while the iterator has next available value
		{
			String s1 = itr.next();
			String st = map.get(s1);
			resultList.add(st);			
		}		
		return resultList;
	}

	@Override
	public boolean removeCache(List<String> lst) 
	{
		// TODO Auto-generated method stub
		//List<String> resultList = new ArrayList<String>();
		ListIterator<String> itr = lst.listIterator();
		while (itr.hasNext()) //while the iterator has next available value
		{
			String s1 = itr.next();
			String st = map.remove(s1);
			System.out.println("the one removed is " +st);
			boolean bool = map.containsValue(st);
//			System.out.println(bool);
			if (bool)
			{
				System.out.println("IN the bool");
				return false;
			}
			//resultList.add(st);			
		}		
		return true;
	}

	@Override
	public boolean insertCache(Map<String, ?> params) {
		// TODO Auto-generated method stub
				//Map.Entry<String, ?>
				//map.put(params.getKey, value)
				//this is for insertion in the hashmap.
				for (Map.Entry<String, ?> en : params.entrySet())
				{
					String keyString = en.getKey();
					String keyValue = (String) en.getValue();
					map.put(keyString, keyValue);
					System.out.println("Putting the value in the Map");
					System.out.println("Key Value " + en.getKey() +" " + en.getValue());
					boolean bool = map.containsValue(keyValue);
					if (!bool)
						return false;
					//storedbobj.insert(en.getKey(), (String)en.getValue());
					//storefileobj.insert(en.getKey(), (String)en.getValue());
				}
				
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updateCache(Map<String, ?> params) {
		// TODO Auto-generated method stub
				//map.put(params.getKey, value)
				for (Map.Entry<String, ?> en : params.entrySet())
				{
					String keyString = en.getKey();
					String keyValue = (String) en.getValue();
					//boolean result = map.replace(keyString, keyValue) != null;
					map.replace(keyString, keyValue);
					boolean bool = map.containsValue(keyValue);
					if (!bool)
						return false;
					
//					if (result)
//					{
//						System.out.println("Updating the value in the Map");
//						System.out.println("Key Value " + en.getKey() +" " + en.getValue());
//						return true;
//					}
						
//					if (map.containsKey(keyString))
//					{
//						map.put(map.get(params), map.get(params)+1);
//					}
//					else
//					{
//						map.put(keyString, keyValue);
//					}
					
					
					
					
					//storedbobj.update(en.getKey(), (String)en.getValue());
//					storefileobj.update(en.getKey(), (String)en.getValue());
				
			//	storedbobj.update(null, null);
				//storefileobj.update(null, null);
				}
				
		// TODO Auto-generated method stub
		return true;
				
	}

	@Override
	public void displayCache() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearCache() {
		// TODO Auto-generated method stub
		
	}
		
	}
	

		
	
		
		//obj.updateCache(params);

