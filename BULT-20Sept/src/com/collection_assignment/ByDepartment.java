package com.collection_assignment;

import java.util.Comparator;

public class ByDepartment implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getDepartment().getDepartmentName().compareTo(e2.getDepartment().getDepartmentName());
}
}
