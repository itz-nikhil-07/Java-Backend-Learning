package com.kodewala.Abstraction1;

public class FoodOrder {

	public boolean oderPlace(String cusname, String orderId) {
		System.out.println("Customer name: " +cusname);
		System.out.println("Order Id: " + orderId);
		System.out.println(" ");
		order();
		process();
		message();
		return true;
	}

	// core functionalities
	//making these private to hide it from other classes
	private String order() {
		System.out.println("Order received");
		return "something about order";
	}

	private void process() {
		System.out.println("Food is ready");
	}

	private String message() {
		System.out.println("Order is out for delivery");
		return "Order out for delivery";
	}

}