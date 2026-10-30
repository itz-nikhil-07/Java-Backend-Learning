package com.kodewala.Interface3;

@FunctionalInterface
interface BonusCalculator {
	double calculateBonus(double salary);

}

class Employee {
	
	public double getBonus(double salary, BonusCalculator calculator) {
		return calculator.calculateBonus(salary);
	}
}