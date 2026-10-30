package com.kodewala.Interface1;

public interface IBooking {
	
	//updates till java 7 
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	
	//java 8 update introduced default method which allows user to put optional method used by any wanting subclass
	public default void autoUpgrade() {
		connectDB();
		System.out.println("IBooking.autoUpgrade()");
	}
	
	//java 8 update introduced static method which allows user to get any common method present in interface and can be used by any wanting class 
	//static method is called as utility method 
	public static void printTicket() {
		System.out.println("IBooking.printTicket()......");
	}
	
	//java 9 updates introduced private method which allows user to use any functionality within the interface 
	//to avoid the code duplicate like we write same logic in each default method so private helps in this thing.
	private static void connectDB() {
		System.out.println("IBooking.connectDB()...");
	}
	//we can make private method static as well
	//visibility of inherited methods should be widen or same but can not be narrowed .... Access modifier
}
