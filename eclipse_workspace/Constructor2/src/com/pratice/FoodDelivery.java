package com.pratice;

public class FoodDelivery {
	int fare;
	int discount  = 0;

	public int calculateDiscount(int fare) {
		if (fare <= 500) {
			discount = 0;
			System.out.println("Your discount is: " + discount);
		}

		else if (fare > 500) {
			discount = fare * 20 / 100;
			if (discount > 300) {
				discount = 300;
				System.out.println("your discount is: " + discount);
			}
		}
		return discount;
	}
	
}