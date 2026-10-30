package com.kodewala.Interface1;

public class Driver {

	public static void main(String[] args) {
		TrainBooking train = new TrainBooking();
		train.autoUpgrade(); //calling default method
		FlightBooking flight = new FlightBooking();
		flight.autoUpgrade();
		FlightBooking.printTicket(); //calling static method in a static way directly from class
	}
}