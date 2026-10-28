package com.kodewala.Interface;

public class Driver {

	public static void main(String[] args) {
		
		IDiscount i = new FlightBooking();
		int result = i.calculateDiscount(100, 10);
		System.out.println(result);
		i.calculateTax(2);
	}
}