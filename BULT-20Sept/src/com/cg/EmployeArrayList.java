package com.cg;

import java.util.*;

class Employee1{
	public int id;
	public String name;
	public String city;
	public static int count = 0;

	//zero argument constructor. Gets called by default when an object is created for the Employee class
	public Employee1(){}

	//Parameterized Constructor
	public Employee1(int id, String name,String city)
	{
		super();
		this.id = id;
		this.name = name;
		this.city=city;
		count++;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return city;
	}
}

public class EmployeArrayList {
	public static void main(String[] args) throws Exception 
	{
		List<Employee1> list = new ArrayList<Employee1>();

		list.add(new Employee1(1, "Ravi","Delhi"));
		list.add(new Employee1(2, "Raj","Mumbai"));
		list.add(new Employee1(3, "Rekha","Chennai"));
		list.add(new Employee1(4, "Ram","Siliguri"));

		for (Employee1 s : list) 
		{
//			System.out.print("ID, Name and City of the employee are : ");
			System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress());
		}
		
		System.out.println("Update ArrayList");
		list.set(1,new Employee1(1, "Koni","Delhi"));
		
		for (Employee1 s : list) 
		{
//			System.out.print("ID, Name and City of the employee are : ");
			System.out.println(s.getId()+" "+s.getName()+" " +s.getAddress());
		}
	}
}