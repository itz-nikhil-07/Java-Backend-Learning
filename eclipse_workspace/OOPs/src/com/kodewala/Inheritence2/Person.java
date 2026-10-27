package com.kodewala.Inheritence2;

public class Person {

	String name;

	Person(String name) {
		this.name = name;
	}

	public void displayPerson() {
		System.out.println(name);
	}
}

class Employee extends Person {
	int salary;

	Employee(String name, int salary) {
		super(name);
		this.salary = salary;
	}

	public void displaySalary() {
		super.displayPerson();
		System.out.println(salary);
	}

	public double calculateBonus(double percentage) {
		return salary * percentage / 100;
	}

	public double calculateBonus(double percentage, double allowance) {
		return salary * percentage / 100 + allowance;
	}
}

class Manager extends Employee {
	String department;

	Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void displaySalary() {
		double bonus = calculateBonus(20);
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
		System.out.println("Bonus: " + bonus);
	}
}