package com.kodewala.markerInterface2;

public class DataCleaner{
	
	public void clean(Object obj) {
		if(obj instanceof Cleanable) {
			System.out.println("Allowed to perfom the cleaning activity");
		}
		else  {
			System.err.println("Not allowed to perform the cleaning activity");
		}
	}
}
