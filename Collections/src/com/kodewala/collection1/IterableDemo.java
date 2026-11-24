package com.kodewala.collection1;

import java.util.ArrayList;

public class IterableDemo {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);

		// printing all elements using a traditional for loop
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
		
		for (int item : numbers) {
			System.out.println(item); //enhanced for loop
		}
		// print even number
		System.out.println("Even numbers");

		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				System.out.println(numbers.get(i));
			}
		}

		// reverse order
		System.out.println("----------");

		for (int i = numbers.size()-1; i >= 0; i--) {
			System.out.println(numbers.get(i));
		}

		// Calculate sum
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			sum += numbers.get(i);
		}
		System.out.println("sum: " + sum);
	}
}