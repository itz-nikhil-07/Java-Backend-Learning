package com.kodewala.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo2 {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(11);
		numbers.add(55);
		numbers.add(100);
		numbers.add(20);

		// creating an iterator
		Iterator<Integer> itr = numbers.iterator();

		// removing all the odd numbers while iterating 
		while (itr.hasNext()) {
			int num = itr.next();
			if (num % 2 != 0) {
				itr.remove();
			}
		}
		//printing the numbers after the odd iteration 
		System.out.println("Numbers are: " + numbers);
	}
}