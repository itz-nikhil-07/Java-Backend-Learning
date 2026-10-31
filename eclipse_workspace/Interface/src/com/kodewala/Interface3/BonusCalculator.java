package com.kodewala.Interface3;

@FunctionalInterface
interface IBonusCalculator {
	double calculateBonus(double salary);

}

class Employee {
	
	public double getBonus(double salary, IBonusCalculator calculator) {
		return calculator.calculateBonus(salary);
	}
}