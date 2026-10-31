package com.kodewala.functionalInterface5;

@FunctionalInterface
interface SalaryCalculator {
	double calculateAnnualSalary(double monthlySalary);
}

public class Demo {

	public static void main(String[] args) {
		SalaryCalculator sc = new SalaryCalculator() {
			
			@Override
			public double calculateAnnualSalary(double monthlySalary) {
				return monthlySalary * 12;
			}
		};
		
		double total = sc.calculateAnnualSalary(115000);
		
		System.out.println("Total annual salary is: ₹" + total);
	}

}
