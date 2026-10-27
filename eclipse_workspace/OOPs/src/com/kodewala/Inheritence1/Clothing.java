package com.kodewala.Inheritence1;

public class Clothing extends ElectronicProduct {

	String type;
	String category;

	public Clothing(String productName, String description, String status, int quantity, boolean isWarranty,
			int warrantyYears, String type, String category) {
		super(productName, description, status, quantity, isWarranty, warrantyYears);
		this.type = type;
		this.category = category;
	}
	
	public void viewClothing() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(status);
		System.out.println(quantity);

		System.out.println(isWarranty);
		System.out.println(warrantyYears);
		
		System.out.println(type);
		System.out.println(category);
	}
}
