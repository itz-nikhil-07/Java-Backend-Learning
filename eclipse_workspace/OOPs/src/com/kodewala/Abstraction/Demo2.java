package com.kodewala.Abstraction;

abstract class Notification {

	private String recipient;
	private String message;

	Notification(String recipient, String message) {
		this.recipient = recipient;
		this.message = message;
	}

	public String getrecipient() {
		return recipient;
	}

	public String message() {
		return message;
	}

	abstract void sendNotification();

	public void displayNotificationDetails() {
		System.out.println("Recipient is: " + recipient);
		System.out.println("Message is: " + message);
	}
}

class EmailNotification extends Notification {

	EmailNotification(String recipient, String message) {
		super(recipient, message);
	}

	@Override
	public void sendNotification() {
		System.out.println("Sending email notification");
	}
}

class SMSNotification extends Notification {

	SMSNotification(String recipient, String message) {
		super(recipient, message);
	}

	@Override
	public void sendNotification() {
		System.out.println("Sending SMS notification");
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Notification[] n = { new EmailNotification("Nikhil", "Hi"), new SMSNotification("Daadu", "Hello") };

		for (Notification n1 : n) {

			n1.displayNotificationDetails();
			n1.sendNotification();
			System.out.println();
		}
	}

}