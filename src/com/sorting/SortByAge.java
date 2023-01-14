package com.sorting;

import java.util.Comparator;

import com.jspider.Employee;

public class SortByAge implements Comparator<Employee>{
	
	public int compare(Employee x, Employee y) {
		return x.getAge()-y.getAge();
	}
}