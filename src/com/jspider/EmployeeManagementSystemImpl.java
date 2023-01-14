package com.jspider;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.customException.EmployeeNotFoundException;
import com.customException.EmployeeRecordNotFound;
import com.customException.InvalidChoiceException;
import com.sorting.SortByAge;
import com.sorting.SortById;
import com.sorting.SortByName;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem{

	
	Map<String, Employee> db= new LinkedHashMap<String, Employee>();
	Scanner sc=new Scanner(System.in);
	
	@Override
	public void addEmployee() {
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println("Enter Ph No.");
		long No=sc.nextLong();
		System.out.println("Enter Designation");
		String desig=sc.next();
		
		Employee e=new Employee(name, age, No, desig);
		db.put(e.getId(), e);
		System.out.println("Employee Record Inserted Successfully");
		System.out.println("Your Id Is: "+e.getId());
		
	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Employee Id");
		String id=sc.next();
		System.out.println();
		
		if(db.containsKey(id)) {
			Employee emp=db.get(id);
			System.out.println("Id: "+emp.getId());
			System.out.println("Name: "+emp.getName());
			System.out.println("Age: "+emp.getAge());
			System.out.println("Ph No. "+emp.getPhNo());
			System.out.println("Designation "+emp.getDesignation());
		}
		else
		{
			try
			{
				throw new EmployeeNotFoundException("Employee Id Not Avilable");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void displayAllEmployee() {
		
		Set<String> keys=db.keySet();
		System.out.println("Employee Record Are As Fallow");
		System.out.println();
		
		if(db.size() != 0)
		{
			for(String key:keys)
			{
				System.out.println(db.get(key));
			}
		}
		else
		{
			try {
				throw new EmployeeRecordNotFound("Employee Record Not Avilable To Display");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void removeEmployee() {
		
		System.out.println("Enter Id");
		String id=sc.next();
		
		if(db.containsKey(id))
		{
			db.remove(id);
			System.out.println("Employee Record Remove Successfully");
		}
		else
		{
			try
			{
				throw new EmployeeNotFoundException("Employee Id Not Avilable");
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
	}

	@Override
	public void removeAllEmployee() {
		System.out.println("Total No. Of Records Avilable: "+db.size());
		db.clear();
		System.out.println("Total No. Of Records Avilable: "+db.size());
		
		
	}

	@Override
	public void updateEmployee() {
		
		System.out.println("Enter Employee Id");
		String id=sc.next();
		
		if(db.containsKey(id))
		{
			Employee emp=db.get(id);
			System.out.println("Option TO Be Updated");
			System.out.println("1: Name\n2: Age\n3: Ph No.\n4: Designation");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				emp.setName(sc.next());
				System.out.println("Name Updated");
				break;
			case 2:
				emp.setAge(sc.nextInt());
				System.out.println("Age Updated");
				break;
			case 3:
				emp.setPhNo(sc.nextLong());
				System.out.println("Ph No. Updated");
				break;
			case 4:
				emp.setDesignation(sc.next());
				System.out.println("Designation Updated");
				break;
			default:
				try
				{
					throw new InvalidChoiceException("ENter Valid Choice");
				}
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		
		}
		else
		{
			try {
				throw new EmployeeNotFoundException("Id Not Avilable");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}

	@Override
	public void countEmployee() {
		
		System.out.println(db.size());
		
	}

	@Override
	public void sortEmployee() {
		
        Set<String> keys=db.keySet();
        
		List<Employee> list=new ArrayList<Employee>();
		for(String key:keys) {
			list.add(db.get(key)); // Adding Student objects from map into list
		}
		
		System.out.println("Enter Choice");
		System.out.println("1: Sort By Id\n2: Sort By Name\n3: Sort By Age");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			Collections.sort(list, new SortById());
			display(list);
			break;
		case 2:
			Collections.sort(list, new SortByName());
			display(list);
			break;
		case 3:
			Collections.sort(list, new SortByAge());
			display(list);
			break;
	    default:
	    	try {
	    		throw new InvalidChoiceException("Enter Valid Choice");
	    	}
	    	catch(Exception e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
			
		}
	
		
	}
	
	private static void display(List<Employee> list) {
		for(Employee e:list)
		{
			System.out.println(e);
		}
	}
}
	
