package com.kodewala.rev.Polymorphism1;

public class Driver {

	public static void main(String[] args) {
		DeliveryProcessor del = new DeliveryProcessor();
		del.processDelivery(new ShipRocket());
		
	}

}
