package com.kodewala.String1;

public class Concat {
	public static void main(String[] args) {
		String s0 = "Kodewala"; // SCP
		String s1 = " Academy";
		String s2 = s0.concat(s1); //adds up the input in existing String 
		System.out.println(s2);
	}
}
// concat method always create new object in Heap memory & a temporary (str) obejct in SCP