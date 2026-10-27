package com.kodewala.Polymorphism1;

public class Client {

	public static void main(String[] args) {
		OrderFood food = new OrderFood();

		FastFood f1 = new FastFood();
		food.OrderFood(f1);

		NorthIndian northfood = new NorthIndian();
		food.OrderFood(northfood);

		SouthIndian southfood = new SouthIndian();
		food.OrderFood(southfood);
	}
}