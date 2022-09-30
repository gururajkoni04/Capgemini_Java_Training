package com.cg;

import java.util.*;   
public class StudentCollection 
{   
	public static void main(String args[])   
	{   
		String array[] = { "Golf", "Soccer", "Baseball", "Volleyball", "Tennis", "Badminton", "Rugby", "Archery", "Skiing"};   
		System.out.println("Array before conversion: "+ Arrays.toString(array));   
		List<String> list = ArrayToListConversion(array);   
		System.out.println("Array as List: " + list);   
		System.out.println("\nTraversing using Itretor\n");
		Iterator it=list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		System.out.println("\nList Sort\n");
		Collections.sort(list);
		System.out.println(list);
	}       
 
	public static <T> List<T> ArrayToListConversion(T array[])   
	{   
		List<T> list = new ArrayList<>();   
		for (T t : array)   
		{   
			list.add(t);   
		}   
		return list;  
		
	}   
}  