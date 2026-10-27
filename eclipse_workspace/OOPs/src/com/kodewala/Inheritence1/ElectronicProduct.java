package com.kodewala.Inheritence1;

public class ElectronicProduct extends Product {

	boolean isWarranty;
	int warrantyYears;

	public ElectronicProduct(String productName, String description, String status, int quantity, boolean isWarranty,
			int warrantyYears) {
		super(productName, description, status, quantity);
		this.isWarranty = isWarranty;
		this.warrantyYears = warrantyYears;
	}

	public void viewElectronicProduct() {
		System.out.println(productName);
		System.out.println(description);
		System.out.println(status);
		System.out.println(quantity);

		System.out.println(isWarranty);
		System.out.println(warrantyYears);
	}
}