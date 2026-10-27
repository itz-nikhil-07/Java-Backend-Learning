package com.kodewala.controlflow;

public class Driver {

	public static void main(String[] args) {
		MakeMyTrip m1 = new MakeMyTrip();
		int enjoy = m1.discount(11000);
		System.out.println(enjoy);
	}
}