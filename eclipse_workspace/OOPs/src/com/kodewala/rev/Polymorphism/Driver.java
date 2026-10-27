package com.kodewala.rev.Polymorphism;

class Delivery {
	public void doDeliver() {
		System.out.println("Delivery.doDeliver() .... Delivery");
	}
}

class ShipRocket extends Delivery{
	@Override
	public void doDeliver() {
		System.out.println("ShipRocket.doDeliver() .... ShipRocket");
	}
}

class Ekart extends Delivery{
	@Override
	public void doDeliver() {
		System.out.println("Ekart.doDeliver() .... Ekart");
	}
}


public class Driver {

	public static void main(String[] args) {
		Delivery del = new Delivery();
		del.doDeliver();
		
		del = new ShipRocket(); //Up casting means parent class referring to child class object
		del.doDeliver();
		
		ShipRocket del1 = (ShipRocket) new Delivery(); //this is down casting means child class is referring to parent class obeject
		del1.doDeliver(); //this throws class caste exception 
	}

}