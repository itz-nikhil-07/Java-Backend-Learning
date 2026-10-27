package com.scanner1;

public class Product {
	String productId;
	String productName;
	int price;

	Product(String pId, String pN, int price) {
		this.productId = pId;
		this.productName = pN;
		this.price = price;
	}

	public void display() {
		System.out.println("====PRODUCT====");
		System.out.println("ID: " + productId);
		System.out.println("Name: " + productName);
		System.out.println("Price: ₹" + price);
	}
}

//this query combines Object creation with Scanner class . 