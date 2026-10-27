package com.kodewala.String4;

class Employee {
	public double salary;
	
	public void setSalary (double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;

	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(300000);
		System.out.println(e1.getSalary());
	}
}