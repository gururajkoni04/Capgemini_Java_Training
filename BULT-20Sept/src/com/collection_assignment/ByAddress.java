package com.collection_assignment;

import java.util.Comparator;

public class ByAddress implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getAddress().getCity().compareTo(e2.getAddress().getCity());
	}
}


