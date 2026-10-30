package com.kodewala.Interface2;

public class Driver {

	public static void main(String[] args) {
		EmailNotification e1 = new EmailNotification();
		
		WhatsAppNotification w1 = new WhatsAppNotification();
		
		NotifyUser u1 = new NotifyUser();
		u1.notify(e1, "hi Nikhil");
		u1.notify(w1, "hi daadu");
	}
}