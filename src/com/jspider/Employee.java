package com.jspider;

public class Employee {
	
	private String id;
	private String name;
	private int age;
	private Long phNo;
	private String designation;
	private static int count=101;
	
	
	public Employee(String name, int age, Long phNo, String designation) {
		super();
		this.id="JSP-"+count;
		this.name = name;
		this.age = age;
		this.phNo = phNo;
		this.designation = designation;
		count++;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public Long getPhNo() {
		return phNo;
	}


	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public static int getCount() {
		return count;
	}


	public static void setCount(int count) {
		Employee.count = count;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", phNo=" + phNo + ", designation="
				+ designation + "]";
	}
	
	
	
	
	
	

}
