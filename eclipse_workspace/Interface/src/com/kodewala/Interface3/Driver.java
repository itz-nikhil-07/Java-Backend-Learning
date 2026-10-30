package com.kodewala.Interface3;

public class Driver {

	public static void main(String[] args) {
		Employee e = new Employee();
		
		BonusCalculator percentageBonus = salary -> salary * 0.10;
		
		BonusCalculator fixedBonus = salary -> 5000;
		
		System.out.println("Percentage Bonus is: ₹" + e.getBonus(115000, percentageBonus));
		
		System.out.println("Fixed Bonus is: ₹" + e.getBonus(115000, fixedBonus));
	}

}
