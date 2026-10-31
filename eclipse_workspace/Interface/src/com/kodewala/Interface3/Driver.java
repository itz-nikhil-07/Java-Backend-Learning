package com.kodewala.Interface3;

public class Driver {
	
	//this is lembda object creation form functional interface

	public static void main(String[] args) {
		Employee e = new Employee();
		
		IBonusCalculator percentageBonus = salary -> salary * 0.10; //calculating percentage bonus
		
		IBonusCalculator fixedBonus = salary -> 5000;  //this is fixed max bonus to any customer
		
		System.out.println("Percentage Bonus is: ₹" + e.getBonus(115000, percentageBonus));
		
		System.out.println("Fixed Bonus is: ₹" + e.getBonus(115000, fixedBonus));
	}
}