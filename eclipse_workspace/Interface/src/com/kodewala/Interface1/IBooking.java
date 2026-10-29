package com.kodewala.Interface1;

public interface IBooking {
	
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	SearchResult search();
	
	public default void autoUpgrade() {
		System.out.println("IBooking.autoUpgrade()");
	}
}
