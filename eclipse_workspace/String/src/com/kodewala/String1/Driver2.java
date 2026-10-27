package com.kodewala.String1;

public class Driver2 {
	public static void main(String[] args) {

		String s3 = "Kodewala"; // SCP
		String s1 = new String("Kodewala"); // HEAP
		String s2 = new String("Kodewala");

		System.out.println(s1 == s2); // two distinct objects in memory
		System.out.println(s1.equals(s2));
		System.out.println(s3 == s1); // different location
		System.out.println(s1.equals(s3));
	}
}