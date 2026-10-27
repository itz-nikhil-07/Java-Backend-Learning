package com.arrayindexing;

public class User {
	String product;
	String price;

	public User(String product, String price) {
		this.product = product;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ProductName: "
				+ product + " and ProductPrice: " + price;
	}

}