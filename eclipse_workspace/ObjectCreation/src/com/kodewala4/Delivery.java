package com.kodewala4;

public class Delivery {
	static int deliverycharge = 0;

	static {
		deliverycharge = 50;
		System.out.println("static init block executed");
	}

	public static void main(String[] args) {
		System.out.println("Delivery charge is: " + deliverycharge);
	}
}
