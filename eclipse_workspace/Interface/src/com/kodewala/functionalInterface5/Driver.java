package com.kodewala.functionalInterface5;

@FunctionalInterface
interface SalaryCal {
	double calculateAnnualSalary(double salary);
}

public class Driver {

	public static void main(String[] args) {

		SalaryCal calculator = salary -> salary * 12;
		double annualSalary = calculator.calculateAnnualSalary(115000);
		System.out.println("total salary is: ₹" + annualSalary);
	}
}