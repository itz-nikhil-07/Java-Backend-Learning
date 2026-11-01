package com.kodewala.functionalInterface5;

//creating different discounts on one product for different customers using functional interface

@FunctionalInterface
interface IDiscount {
	double calculateDiscount(double amount);
}

class Customer {   //creating class without implementing interface and still calling interface method to do work

	public double calculateFinalDiscount(double amount, IDiscount calci) {
		double discount = calci.calculateDiscount(amount);
		return amount - discount;
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Customer c = new Customer();
		double total = c.calculateFinalDiscount(1000, amount -> amount * 0.10);  //creating multiple discount method using lembda
		System.out.println("Price after 10% discount is: ₹" + total);

		double total1 = c.calculateFinalDiscount(1000, amount -> 500);
		System.out.println("Maximum discount is: ₹" + total1);

		double total2 = c.calculateFinalDiscount(1000, amount -> amount * 0.20);
		System.out.println("Price after 20% discount is: ₹" + total2);
	}
}