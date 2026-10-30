package com.kodewala.Interface2;

public interface NotificationService {

	abstract void sendNotification(String message);

}

class EmailNotification implements NotificationService {
	@Override
	public void sendNotification(String message) {
		System.out.println("EmailNotification.sendNotification()");
	}
}

class WhatsAppNotification implements NotificationService {
	@Override
	public void sendNotification(String message) {
		System.out.println("WhatsAppNotification.NotificationService()");
	}
}

class NotifyUser {
	
	public void notify(NotificationService service , String message) {
		service.sendNotification(message);
		
	}
}