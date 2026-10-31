package com.kodewala.Interface4;

interface IOnlineOrder {

	default void calculateDeliveryCharge() {
		System.out.println("OnlineOrder.calculateDeliveryCharge()...");
	}
}

interface IStoreOrder {

	default void calculateDeliveryCharge() {
		System.out.println("StoreOrder.calcualteDeliveryCharge()...");
	}
}

class Order implements IOnlineOrder, IStoreOrder {
	@Override
	public void calculateDeliveryCharge() {     //resolving the ambiguity of default method by overriding the method
		System.out.println("hi this is nikhil at 17lpa package");
		IOnlineOrder.super.calculateDeliveryCharge();
		IStoreOrder.super.calculateDeliveryCharge();
	}
}

public class Demo1 {

	public static void main(String[] args) {
		Order o = new Order();
		o.calculateDeliveryCharge();
	}
}