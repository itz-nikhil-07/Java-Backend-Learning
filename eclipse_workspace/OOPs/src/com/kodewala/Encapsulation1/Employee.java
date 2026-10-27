package com.kodewala.Encapsulation1;

public class Employee {
	private double salary;
	
	public void setsalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setsalary(30000);
		double result = e1.getSalary();
		System.out.println(result);
	}
}