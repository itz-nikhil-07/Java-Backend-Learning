package com.kodewala.String1;

public class Driver {

	// objects of String are created in SCP (String constant pool) inside HEAP
	// memory
	public static void main(String[] args) {
		String s1 = "Kodewala Academy"; // object 1 is created
		String s2 = "Kodewala Academy   "; // tried to create object but it already exist so
	    // no new object created instead SCP reference this one with s1 object

		System.out.println(s1 == s2); // == operator compares two address
		System.out.println(s1.charAt(3)); 
		System.out.println(s2.indexOf("w"));
		System.out.println(s1.lastIndexOf("e"));
		String[] s3 = s1.split(":");
		System.out.println(s3);
		System.out.println(s1.replace("a","e"));
		//System.out.println(s1.trim());

		String name = "Nikhil";
		String age = "22";
		String nickname = name.intern(); //intern method used to point same reference

		// name and age are reference names only

		System.out.println(name.equals(nickname)); // here there are 2 objects created
	    System.out.println(name == nickname);
	    System.out.println(name == age);
	}
}