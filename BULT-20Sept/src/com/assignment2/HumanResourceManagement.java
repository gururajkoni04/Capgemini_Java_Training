package com.assignment2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.*;
class Employee{
	String name; String email; String address; String birthday; String work; String technology;
	public void setWork(String work) {
		this.work = work;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Employee(String name, String email, String address, String birthday) {
		this.name = name;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		/*this.technology = technology;
	this.work = work;*/
	}
	public void print(){
		System.out.println("Name: "+name);
		System.out.println("E-mail: "+email);
		System.out.println("Address: "+address);
		System.out.println("Birthday: "+birthday);
		System.out.println("Technology: "+technology);
		System.out.println("Work: "+work);
	}
}
class Programmer extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Programmer(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class Tester extends Employee{
	/*@Override
	public void setWork(String work) {
	this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
	this.technology = technology;
	}*/
	public Tester(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class Designer extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Designer(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class Business_Developer extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Business_Developer(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class Team_Leader extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Team_Leader(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class Architect extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Architect(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class CTO extends Architect{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public CTO(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
class CEO extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public CEO(String name, String email, String address, String birthday, String technology, String work) {
		super(name, email, address, birthday);
	}
}
class CFO extends Employee{
	@Override
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public CFO(String name, String email, String address, String birthday) {
		super(name, email, address, birthday);
	}
}
public class HumanResourceManagement {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Employee Designation: ");
		String employee = br.readLine();
		System.out.println("Enter Name: ");
		String name = br.readLine();
		System.out.println("Enter E-mail: ");
		String email = br.readLine();
		System.out.println("Enter Address: ");
		String address = br.readLine();
		System.out.println("Enter Birthday");
		String birthday = br.readLine();
		Employee e = new Employee(name,email,address,birthday);
		switch(employee){
		case "Programmer":
			e.setTechnology("Programming");
			e.setWork("code,fix bugs");
			break;
		case "Tester":
			e.setTechnology("Testing Methodologies");
			e.setWork("test,verify");
			break;
		case "Designer":
			e.setTechnology("Design philosophy, Design tools used");
			e.setWork("Design");
			break;
		case "BusinessDeveloper":
			e.setTechnology("Specialized Domains");
			e.setWork("Collect requirements, analyze requirements, write documents");
			break;
		case "TeamLeader":
			e.setTechnology("Team Collaboration tools, development methods");
			e.setWork("Schedule, organize, manage programmers, designers and testers");
			break;
		case "Architect":
			e.setTechnology("Design methodology");
			e.setWork("design system");
			break;
		case "CTO":
			e.setTechnology("Technology Domains");
			e.setWork("advise technologies");

			break;
		case "CEO":
			e.setTechnology("Vision, Mission");
			e.setWork("Executive Management");
			break;
		case "CFO":
			e.setTechnology("Finance management skills");
			e.setWork("Manage finance");
			break;
		}
		e.print();
	}
}
