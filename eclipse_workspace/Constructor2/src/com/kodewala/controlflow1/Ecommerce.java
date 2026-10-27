package com.kodewala.controlflow1;

public class Ecommerce {

	public double discount(String customerType, double amount) {

		if (amount <= 1000) {
			return 0;
		}
		double percentage;

			switch (customerType.toLowerCase()) {
			case "gold":
				percentage = 20;
				break;

			case "silver":
				percentage = 10;
				break;

			case "regular":
				percentage = 5;
				break;

			default:
				System.err.println("You are not a subscribed customer");
				return 0;
			}
			double discount = amount * percentage / 100;
			
			if (discount > 2500) {
				discount = 2500;
			}
			return discount;
	}
}