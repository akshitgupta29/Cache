package com.cache;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashMapStorage obj = new HashMapStorage();
		Map <String,String> params = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no of values you want to enter");
		int n = sc.nextInt();
		for (int i=0; i<n;i++)
		{
			System.out.println("Enter key");
			String key = sc.nextLine();
			System.out.println("Enter value");
			String value = sc.nextLine();
			params.put(key, value);
			obj.insertCache(params);

		}
		
		obj.removeCache(null);
		obj.updateCache(null);
		obj.readCache(null);
		//System.out.println("Enter where you want to input the data");
		
		
				
			
		}
			
				
	}


