package com.scanner;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the name ");
		String name = sc.nextLine(); // this will move the line to next , without line only next will shift the
										// character to next line

		System.out.println("Please enter the price ");
		int price = sc.nextInt();

		sc.nextLine();  //this will shift the next input in next line cuz after int there is a automatic line below it 

		System.out.println("Please enter the address ");
		String address = sc.nextLine();

		System.out.println(name);
		System.out.println(price);
		System.out.println(address);
		sc.close();
	}

}