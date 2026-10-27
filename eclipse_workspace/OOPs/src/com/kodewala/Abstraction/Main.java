package com.kodewala.Abstraction;

abstract class Employee {
	String name;
	double salary;
	
	Employee(String name , double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	abstract double calculateBonus();
	
	public void displayDetails() {
		System.out.println("Name: " + name + "," + "Salary: " + salary);
	}
}

class PermanentEmployee extends Employee {
	
	PermanentEmployee(String name, double salary) {
		super(name,salary);
	}
	
	@Override
	public double calculateBonus() {
		return salary * 20 / 100;
	}
}

class ContractEmployee extends Employee {
	
	ContractEmployee(String name, double salary) {
		super(name,salary);
	}
	
	@Override
	public double calculateBonus() {
		return salary * 10 / 100;
	}
}

public class Main {

	public static void main(String[] args) {
		PermanentEmployee p1 = new PermanentEmployee("Nikhil",50000);
		p1.displayDetails();
		System.out.println("Bonus is: " + p1.calculateBonus());
		
		ContractEmployee c1 = new ContractEmployee("Daadu",70000);
		c1.displayDetails();
		System.out.println("Bonus is: " + c1.calculateBonus());
	}

}