package com.kodewala.controlflow1;

public class Driver {

	public static void main(String[] args) {
		Ecommerce e1 = new Ecommerce();
		String customerType = args[0]; // making the input as command line argument
		double amount = Double.parseDouble(args[1]); //converting the command line argumet from string to double
		double calculate = e1.discount(customerType, amount); // calling the method 
		System.out.println("Discount: ₹" + calculate);
	}
}