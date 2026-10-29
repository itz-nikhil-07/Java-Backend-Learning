package com.kodewala.Interface;

public class FlightBooking implements IDiscount{
	
	@Override
	public int calculateDiscount(int amount , int rate) {
		
		int finalFare = (amount * rate)/100;
		return finalFare;
	}
	
	@Override
	public void calculateTax(int tax) {
		System.out.println("FlightBooking.calculateTax()");
	}
}