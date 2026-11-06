package com.kodewala.heap1;

	public class Address implements Cloneable{
		String line1;
		String line2;
		String city;
		
		public Address(String line1, String line2,String city) {
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
		}
	}