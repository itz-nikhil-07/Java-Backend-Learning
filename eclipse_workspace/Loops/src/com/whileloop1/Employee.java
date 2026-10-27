package com.whileloop1;

public class Employee {
	String name;
	double salary;
	String department;

	public Employee(String name, double salary, String department) {
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void display() {
		System.out.println("Name: " + name + "," + "Salary: " + salary + "," + "Department: " + department);
	}
}