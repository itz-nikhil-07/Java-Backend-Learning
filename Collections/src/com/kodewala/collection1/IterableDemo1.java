package com.kodewala.collection1;

import java.util.ArrayList;
import java.util.Iterator;

public class IterableDemo1 {
	public static void main(String[] args) {

		ArrayList<String> elec = new ArrayList<>();
		elec.add("Mobile");
		elec.add("Laptop");
		elec.add("Keyboard");
		elec.add("Joystick");
		elec.add("CPU");

		// creating iterators
		Iterator<String> itr = elec.iterator();

		// Iterating elements
		while (itr.hasNext()) {
			String electric = itr.next();
			System.out.println(elec);
		}
	}
}