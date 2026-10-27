package com.kodewala.controlflow;

public class MakeMyTrip {
	int fare;
	int amount = 0;
	public int discount(int fare) {
	
		if (fare < 5000) {
			System.out.println("no discount");
			amount = fare;
		}
		else if (fare >=5000 && fare <=10000) {
			int amount = fare * 10 / 100;
			System.out.println("your 10% discount is: " + amount);
		}
		else if (fare > 10000) {
			int amount =fare *  15 / 100 ; //integer start calculation from left side.
			if (amount >= 1250) {
				amount = 1250;
				System.out.println("Your 15% discount is: " + amount);
			}	
		}
		return fare;
	}
	
}
