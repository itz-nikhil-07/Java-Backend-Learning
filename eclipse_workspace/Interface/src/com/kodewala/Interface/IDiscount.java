package com.kodewala.Interface;

public interface IDiscount {
	
	public abstract int calculateDiscount(int amount , int rate);
	
	public abstract void calculateTax(int tax);
}
