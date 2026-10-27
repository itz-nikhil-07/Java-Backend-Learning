package com.partice2;

public class EmployeeSalary {
	int salary;
	int bonus = 0;

	public int calculateBonus(int salary) {
		if (salary < 30000) {
			bonus = salary * 5 / 100;
			System.out.println("Your bonus is: " + bonus);
		} else if (salary > 30000) {
			bonus = salary * 10 / 100;
			if (bonus > 5000) {
				bonus = 5000;
			}
			System.out.println("Your bonus is: " + bonus);
		}
		return salary;
	}

}
