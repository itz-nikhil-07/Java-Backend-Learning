package com.kodewala.Encapsulation1;

public class Product {
	private String productName;
	private int price;
	
	public String setProductName(String productName) {
		this.productName = productName;
		return productName;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public int setPrice(int price) {
		if (price > 0) {
		this.price = price;
		}
		else {
			System.err.println("Price must be greater than 0");
		}
		return price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product();
		String name = p1.setProductName("Laptop");
		int result = p1.setPrice(-10000);
		System.out.println("Product name is: " + name);
		System.out.println("Product price is: " + result);
	
	}
}