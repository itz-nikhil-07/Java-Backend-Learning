package com.kodewala.String3;

public class BufferMethod {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello"); //String buffer object modify string
		                                             //without creating new object.
		
		sb.append(" world");
		sb.append(" kodewala");
		System.out.println(sb);
		System.out.println(sb.length()); //counts the length of string buffer object 
		System.out.println(sb.capacity()); //Tells the capacity of string //21
		System.out.println(sb.charAt(17)); //points the character at particular index
		System.out.println(sb.delete(16,20)); //delete the char from star to end index
		System.out.println(sb.deleteCharAt(5)); //delete character at particular index
		sb.ensureCapacity(25);
		System.out.println(sb.capacity()); //increases the capacity of String 
		System.out.println(sb.insert(5, " ")); //asks index then character then it modify
		                                       //string with command input
		//System.out.println(sb.reverse()); // reverse the entire string 
		System.out.println(sb.replace(0, 4,"wooho"));
	}
}