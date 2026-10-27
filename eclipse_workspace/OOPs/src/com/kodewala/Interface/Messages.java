package com.kodewala.Interface;

interface Notification {
	void sendMessage();
	
	//default method introduced in java after java 8  
	//by default inherited by class and can be overridden accordingly
	default void showStatus() {  
		System.out.println("Notification service is active");
	}
}

class EmailNotification implements Notification {
	
	@Override 
	public void sendMessage() {
		System.out.println("EmailNotification.sendMessage()");
	}
}


public class Messages {

	public static void main(String[] args) {
		Notification n = new EmailNotification();
		n.sendMessage();
		n.showStatus();
	}
}