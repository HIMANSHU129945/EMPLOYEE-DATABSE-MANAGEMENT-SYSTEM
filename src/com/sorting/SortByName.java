package com.sorting;

import java.util.Comparator;

import com.jspider.Employee;

public class SortByName implements Comparator<Employee>{
	
	public int compare(Employee x, Employee y) {

		return x.getName().compareTo(y.getName());
	}
}
