package com.kodewala.Interface;

interface MessageService {
	
	//trying to create private method but can't as it was introduced in java 9
	//private methods are not visible outside the interface
	// private void formatMessage() {
	// System.out.println("Preparing message ....");

	default void sendMessage() {
		System.out.println("Message sent successfully");
	}
}

class EmailService implements MessageService {

}

public class Driver1 {

	public static void main(String[] args) {
		EmailService e = new EmailService();
		e.sendMessage();
	}
}