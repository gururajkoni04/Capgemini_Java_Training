package com.collection_assignment;
import java.util.Comparator;

public class ByEmployeeId implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getEmployeeId().compareTo(e2.getEmployeeId());
	}
}
