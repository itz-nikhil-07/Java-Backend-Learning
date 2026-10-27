package com.kodewala.Inheritence1;

public class Product {
	String productName;
	String description;
	String status;
	int quantity;

	public Product(String productName, String description, String status, int quantity) {
		super();
		this.productName = productName;
		this.description = description;
		this.status = status;
		this.quantity = quantity;
	}

	public void viewProduct() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(status);
		System.out.println(quantity);
	}
}