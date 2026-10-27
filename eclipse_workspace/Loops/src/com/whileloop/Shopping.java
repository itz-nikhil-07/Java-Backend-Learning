package com.whileloop;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (true) {
			System.out.println("Enter the Product Price");
			int price = sc.nextInt();

			if (price < 0) {
				continue;
			}
			if (price == 0) {
				break;
			}
			sum += price;
		}
		System.out.println("Total sum is: " + sum);
		sc.close();
	}
}