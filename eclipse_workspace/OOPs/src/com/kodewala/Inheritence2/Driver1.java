package com.kodewala.Inheritence2;

public class Driver1 {

	public static void main(String[] args) {
		Manager m1 = new Manager("Nikhil", 115000, "Java Backend");
		m1.displaySalary();
		double result = m1.calculateBonus(20, 20000);
		System.out.println("Bonus with allowance: " + result);
		double total = m1.salary + result;
		System.out.println("Total Salary: " + total);
	}
}