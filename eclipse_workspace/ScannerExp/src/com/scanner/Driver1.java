package com.scanner;

import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //creating the scanner object 
		int price = 0;
		System.out.println("Please enter the price - ");
		
		if (sc.hasNextInt()) {  // (hasNextInt) Validates the input whether it is true of false 
			price = sc.nextInt();
		}
		else {
			System.err.println("Please enter the price in right format");
		}
		System.out.println("The price is - " + price );
		sc.close(); //closing the scanner object 
	}
}

//always close the scanner object if not then garbage collector will never delete it due to being run all the time .