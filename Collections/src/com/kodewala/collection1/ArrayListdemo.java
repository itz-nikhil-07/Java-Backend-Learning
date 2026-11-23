package com.kodewala.collection1;
import java.util.ArrayList;

/*
 * Array list allows multiple null and duplicate items 
 * it prints all in order 
 */

public class ArrayListdemo {
	public static void main(String[] args) {
		
		ArrayList<String> learners = new ArrayList<String>();
		
		learners.add("Gautam");
		learners.add("Anil");
		learners.add("Nikhil");
		learners.add("Nikhil");
		learners.add(null);
		learners.add(null);
		
		System.out.println(learners);
	}
}