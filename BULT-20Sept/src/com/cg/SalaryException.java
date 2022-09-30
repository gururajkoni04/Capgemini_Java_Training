package com.cg;

import java.util.Scanner;
import java.io.IOException;

public class SalaryException {
	public static void main(String args[]) throws NumberFormatException, IOException {
		try {
			Scanner sc=new Scanner(System.in);
			double salary;
			System.out.println("Enter salary: ");
			salary=sc.nextDouble();
			
			if (salary < 6000 || salary >= 20000 || salary < 0) {
				throw new SalaryRangeException("Salary should be non negative and in between 6,000 to 20,000.");
			}
			System.out.println("Salary : " + salary);

		}
		catch(SalaryRangeException e){
			System.out.println("OverRangeException:"+e.getMessage());
		}				
	}
}
class SalaryRangeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalaryRangeException(String message) {
		super(message);
	}
}