package com.collection_assignment;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainClass {
	public static boolean isEmployeeIDValid(String employeeID) {
		String ID_REGEX = "[0-9]{5}" + "_" + "[A-Z]{2}";
		Pattern pattern = Pattern.compile(ID_REGEX);
		Matcher matcher = pattern.matcher(employeeID);
		return matcher.matches();
		}
	public static boolean isSalaryValid(int employeeSalary) {
		if (employeeSalary > 200000 || employeeSalary < 500000) {
			return true;
			} else {
				return false;
				}
		}
	public static boolean isFirstName(String employeeFirstName) {
		String FIRST_REGEX = "[a-zA-Z]*";
		Pattern pattern = Pattern.compile(FIRST_REGEX);
		Matcher matcher = pattern.matcher(employeeFirstName);
		return matcher.matches();
		}
	public static boolean isLastName(String employeeLastName) {
		String LAST_REGEX = "[a-zA-Z]*";
		Pattern pattern = Pattern.compile(LAST_REGEX);
		Matcher matcher = pattern.matcher(employeeLastName);
		return matcher.matches();
		}
	public static boolean isCorrectDate(String employeeDate) {
		final DateTimeFormatter DATE_PARSER = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate today = LocalDate.now();
		LocalDate myDate = LocalDate.parse(employeeDate, DATE_PARSER);
		if (myDate.isAfter(today) || myDate.isEqual(today)) {
			return true;
			} else {
				return false;
				}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empSal = 0;
		String empFname = null;
		String empLname = null;
		String empDoj = null;
		int choice = 0;
		String empId = null;
		int empAddId = 0;
		String empAddLine = null;
		String empCity = null;
		String empState = null;
		int empDeptId = 0;
		String empDeptName = null;
		String empDeptLoc = null;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();
		while (true) {
			System.out.println("1.Save Unique Employee");
			System.out.println("2.Sort Employee");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number of Employees");
				int num = scan.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("Enter the employee Id(Employee ID should be 5Digits and 2 chars):");
					scan.nextLine();
					empId = scan.nextLine();
					if (isEmployeeIDValid(empId)) {
						System.out.println("Employee Id:" + empId);
						} else {
							System.out.println("Enter the employee Id as specified");
							break;
							}
					System.out.println("Enter the salary(Salary between 20000 to 5lak):");
					empSal = scan.nextInt();
					if (isSalaryValid(empSal)) {
						System.out.println("Salary:" + empSal);
						} else {
							System.out.println("Enter the salary as specified");
							break;
							}
					System.out.println("Enter the First name(should be alphabets):");
					scan.nextLine();
					empFname = scan.nextLine();
					if (isFirstName(empFname)) {
						System.out.println("Employee First Name:" + empFname);
						} else {
							System.out.println("Enter the first name as specified");
							break;
							}
					System.out.println("Enter the Last name(should be alphabets):");
					empLname = scan.nextLine();
					if (isLastName(empLname)) {
						System.out.println("Employee Last Name:" + empLname);
						} else {
							System.out.println("Enter the last name as specified");
							break;
							}
					System.out.println("Enter the date of joining(Join date must be today/future date.):");
					empDoj = scan.nextLine();
					if (isCorrectDate(empDoj)) {
						System.out.println("Employee Date of joining:" + empDoj);
						System.out.println("Enter the Address id");
						empAddId = scan.nextInt();
						System.out.println("Enter the Address line");
						scan.nextLine();
						empAddLine = scan.nextLine();
						System.out.println("Enter the city");
						empCity = scan.nextLine();
						System.out.println("Enter the state");
						empState = scan.nextLine();
						System.out.println("Enter the Department Id");
						empDeptId = scan.nextInt();
						System.out.println("Enter the Department name");
						scan.nextLine();
						empDeptName = scan.nextLine();
						System.out.println("Enter the Department location");
						empDeptLoc = scan.nextLine();
						Address empAdr1 = new Address(empAddId, empAddLine, empCity, empState);
						Department empDept1 = new Department(empDeptId, empDeptName, empDeptLoc);
						empList.add(new Employee(empId, empFname, empLname, empSal, empDoj, empAdr1, empDept1));
						} else {
							System.out.println("Enter the date as specified");
							}
					}
					break;
					case 2:
						System.out.println("a.ByEmployeeID");
						System.out.println("b.ByFirstName");
						System.out.println("c.ByLastName");
						System.out.println("d.BySalary");
						System.out.println("e.ByAddress");
						System.out.println("f.ByDepartment");
						System.out.println("Enter the choice");
						scan.nextLine();
						String input = scan.nextLine();
						switch (input) {
						case "a":
							Collections.sort(empList, new ByEmployeeId());
							break;
						case "b":
							Collections.sort(empList, new ByFirstName());
							break;
						case "c":
							Collections.sort(empList, new ByLastName());
							break;
						case "d":
							Collections.sort(empList, new BySalary());
							break;
						case "e":
							Collections.sort(empList, new ByAddress());
							break;
						case "f":
							Collections.sort(empList, new ByDepartment());
							break;
							}
						for (Employee p : empList) {
							System.out.println("-Employee ID- " + p.getEmployeeId() + "-First Name- " + p.getFirstName()+ "-Last Name- " + p.getLastName() + "-Salary- " + p.getSalary() + "-Joining Date- "+ p.getJoinDate() + "-Address- " + p.getAddress().getAddressId()+ p.getAddress().getAddressLine1() + p.getAddress().getCity() + p.getAddress().getState()+ "-Department- " + p.getDepartment().getDepartmentId()+ p.getDepartment().getDepartmentName() + p.getDepartment().getLocation());
							}
					break;
					case 3:
						return;
						}
			}
		}
	}


