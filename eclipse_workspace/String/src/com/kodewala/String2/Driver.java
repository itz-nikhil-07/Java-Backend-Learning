package com.kodewala.String2;

public class Driver {

	public static void main(String[] args) {

		String s = "Kodewala"; // SCP
		String s1 = "Academy"; // SCP
		
		String s2 = s + s1; // heap
		System.out.println(s2);
	

		String s3 = "Hi" + " my name is" + " Nikhil";
		String s4 = " &" + " I study" + " in Kodewala Academy";
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3 + s4);

	}

}
// "+" Operator behaves like concat method in String but dose not create new object like it.
// it tells jvm to merge into one object during compilation 