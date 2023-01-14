package com.jspider;

import java.util.Scanner;

import com.customException.InvalidChoiceException;

public class Main_class {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeManagementSystem e= new EmployeeManagementSystemImpl();
		
		System.out.println("Welcome To Employee Management System");
		System.out.println();
		
		while(true)
		{
			System.out.println("1: Add Employee\n2: Display Employee\n3: Display All Employee");
			System.out.println("4: Remove Employee\n5: Remove All Employee\n6: Update Employee");
			System.out.println("7: Count Employee\n8: Sort Employee\n9: Exit");
			System.out.println();
			
			System.out.println("Enter Choice");
			int choice=sc.nextInt();
			
			switch(choice) 
			{
			case 1:
				e.addEmployee();
				break;
			case 2:
				e.displayEmployee();
				break;
			case 3:
				e.displayAllEmployee();
				break;
			case 4:
				e.removeEmployee();
				break;
			case 5:
				e.removeAllEmployee();
				break;
			case 6:
				e.updateEmployee();
				break;
			case 7:
				e.countEmployee();
				break;
			case 8:
				e.sortEmployee();
			case 9:
				System.out.println("Thank You!");
				System.exit(0);
				break;
			default:
				try {
					throw new InvalidChoiceException("Invalid Choice");
				}
				catch(Exception ee){
					System.out.println(ee.getMessage());
					
				}		
			
			}// Switch case close
			System.out.println();
		}// while loop close
		
		
	}
}
