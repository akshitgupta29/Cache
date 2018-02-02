package com.cache;
import com.cache.Cache;

public class CachableObject<T>
{
	T obj;
	public void set (T obj)
	{
		this.obj  =obj;
	}
	public T get()
	{
		return obj;
	}
	
	public static void main(String[] args) {
		CachableObject<Integer> obj = new CachableObject<>();
		obj.set(5);
		System.out.println(obj.get());
	}
}

