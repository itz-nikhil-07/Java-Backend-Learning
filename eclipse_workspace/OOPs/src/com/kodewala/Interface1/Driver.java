package com.kodewala.Interface1;

interface Employee {
	double calculateSalary();

	void showDetails();
}

interface PermanentEmployee extends Employee {
	double calculateBonus();
}

class Developer implements PermanentEmployee {
	int salary;
	String name;

	Developer(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public double calculateSalary() {
		return salary;
	}

	@Override
	public double calculateBonus() {
		return 5000;
	}

	@Override
	public void showDetails() {
		System.out.println("Developer name is: " + name);
		System.out.println("Salary is: " + calculateSalary());
		System.out.println("Bonus is: " + calculateBonus());
	}
}

public class Driver {

	public static void main(String[] args) {
		Developer d = new Developer("Nikhil", 115000);
		d.showDetails();
	}
}