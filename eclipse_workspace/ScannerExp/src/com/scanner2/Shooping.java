package com.scanner2;

public class Shooping {
	String name;
	String productName;
	int price;
	int quantity;
	boolean delivery;

	Shooping(String name, String pN, int price, int q, boolean del) {
		this.name = name;
		this.productName = pN;
		this.price = price;
		this.quantity = q;
		this.delivery = del;
	}
}
