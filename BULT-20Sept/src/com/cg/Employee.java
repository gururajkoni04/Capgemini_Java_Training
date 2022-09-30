package com.cg;

public class Employee {
	int empId;
	String empName,empMail;
	double empSalary;
	
	Employee(int empId, String empName, double empSalary, String empMail){
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		this.empMail=empMail;
	}
	
	public void showEmployeeDetails() {
		System.out.println("----------------------------------------");
		System.out.println("Employee Details");
		System.out.println("ID: "+this.empId);
		System.out.println("Name: "+this.empName);
		System.out.println("Salary: "+this.empSalary);
		System.out.println("Mail: "+this.empMail);
		System.out.println("----------------------------------------");
	}

}
