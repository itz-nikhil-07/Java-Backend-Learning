package Notificationservice;

public class Driver {
	public static void main(String[] args) {
		Notification notification = new Notification();

		notification.sendNotification("sms");
		notification.sendNotification("email");
		notification.sendNotification("whatsapp");

	}
}