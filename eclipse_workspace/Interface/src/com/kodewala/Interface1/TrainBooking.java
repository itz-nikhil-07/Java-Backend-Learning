package com.kodewala.Interface1;

public class TrainBooking implements IBooking {

	@Override
	public Booking book() {
		
		return null;
	}

	@Override
	public void cancelBooking() {
		
	}

	@Override
	public Booking checkStatus() {
		
		return null;
	}

	@Override
	public SearchResult search() {

		return null;
	}
	
	@Override 
	public void autoUpgrade() {
		System.out.println("TrainBooking.autoUpgrade()");
	}
	

}
