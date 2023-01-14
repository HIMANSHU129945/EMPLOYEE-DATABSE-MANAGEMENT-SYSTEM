package com.sorting;

import java.util.Comparator;

import com.jspider.Employee;

public class SortById implements Comparator<Employee> {
	
	public int compare(Employee x, Employee y) {
		return x.getId().compareTo(y.getId());
	}
}
