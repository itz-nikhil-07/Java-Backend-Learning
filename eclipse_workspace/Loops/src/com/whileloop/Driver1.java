package com.whileloop;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		int luckyNumber = 17;
		int userEntered = 0;
		
		while (userEntered != luckyNumber) {
			System.out.println("Please enter the number - ");
			userEntered = sc.nextInt();
			
			if (userEntered == luckyNumber) {
				System.out.println("You won!!!");
			}
			else {
				System.err.println("keep trying ...");
			}
		}
sc.close();
	}

}