package com.kodewala.Interface;

interface Vehicle {
	void start();
}

interface ElectricVehicle extends Vehicle {    //one interface can extend multiple interface and one class can implement multiple interface
	void chargeBattery();
}

class ElectricCar implements ElectricVehicle {
	@Override
	public void start() {
		System.out.println("Car starting");
	}
	
    @Override
	public void chargeBattery() {
		System.out.println("Battery charging");
	}
}

public class Driver2 {

	public static void main(String[] args) {
		ElectricVehicle ec = new ElectricCar();
		ec.chargeBattery();
		ec.start();
	}
}