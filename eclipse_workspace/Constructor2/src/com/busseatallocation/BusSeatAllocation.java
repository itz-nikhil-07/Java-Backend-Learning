package com.busseatallocation;

public class BusSeatAllocation {
	
	public boolean availability(int age,boolean seniorcitizen,boolean pregnant,boolean regularseatavailable) {
		boolean prioritypax = seniorcitizen || pregnant || age > 60;

		if (prioritypax) {
			System.out.println("priority seat available");
			if (regularseatavailable) {
				System.out.println("seat allocated");
			}

			else {
				System.out.println("No seat available");
			}
		} else {
			if (regularseatavailable) {
				System.out.println("go to regular seat");
			} else {
				System.out.println("No seat available");
			}
		}
		return pregnant;

	}

}