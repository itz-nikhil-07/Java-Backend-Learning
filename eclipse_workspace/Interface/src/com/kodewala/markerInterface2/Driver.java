package com.kodewala.markerInterface2;

public class Driver {
	public static void main(String[] args) {

		User u = new User("Nikhil", "123");
		DataCleaner dc = new DataCleaner();
		dc.clean(u);
	}
}