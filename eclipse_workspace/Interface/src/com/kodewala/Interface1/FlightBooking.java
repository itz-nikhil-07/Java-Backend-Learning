package com.kodewala.Interface1;

public class FlightBooking implements IBooking {

	@Override
	public Booking book() {

		return null;
	}

	@Override
	public void cancelBooking() {
		
	}

	@Override
	public Booking checkStatus() {

		return null;
	}

	@Override
	public SearchResult search() {

		return null;
	}
	
	public static void printTicket() {
		System.out.println("FlightBooking.printTicket()...");
	}

}
