package com.kodewala.Interface1;

public class Driver {

	public static void main(String[] args) {
		TrainBooking train = new TrainBooking();
		train.autoUpgrade();
		FlightBooking flight = new FlightBooking();
		flight.autoUpgrade();
	}
}