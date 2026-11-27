package com.kodewala.collection2;
import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
		
		books.add("ikigai");
		books.add("atomic");
		books.add("power mind");
		books.add("gaban");
		
		System.out.println(books.size());
		System.out.println(books);
	}
}