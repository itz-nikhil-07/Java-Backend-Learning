package com.kodewala.Abstraction;

abstract class Vehicle {
	int registrationNumber;
	double ratePerDay;
	
	Vehicle(int registrationNumber, double ratePerDay) {
		this.registrationNumber = registrationNumber;
		this.ratePerDay = ratePerDay;
	}
	
	abstract double calculateRental(int days);
	
	public void displayVehicleDetails() {
		System.out.println("Vehicle number is: " + registrationNumber + "," + " Rate per day is: ₹" + ratePerDay);
	}
	
	public double calculateDiscount(double amount) {
		return amount * 10 / 100;
	}
}


class Car extends Vehicle {
	
	Car(int registrationNumber, double ratePerDay) {
		super(registrationNumber,ratePerDay);
	}
	
	@Override
	public double calculateRental(int days) {
		double total = ratePerDay * days;
		return total - calculateDiscount(total);
	}
}


class Bike extends Vehicle {
	
	Bike (int registrationNumber, double ratePerDay) {
		super(registrationNumber,ratePerDay);
	}
	
	@Override
	public double calculateRental(int days) {
		return days *  ratePerDay;
	}
}


public class Demo1 {

	public static void main(String[] args) {
		Car c = new Car(7777,200);
		c.displayVehicleDetails();
		System.out.println("Total amount after discount is: ₹" + c.calculateRental(5));
		
		System.out.println(" ");
		Vehicle b = new Bike(0042,110);
		b.displayVehicleDetails();
		System.out.println("Total amount to be paid is: ₹" + b.calculateRental(2));		
	}
}