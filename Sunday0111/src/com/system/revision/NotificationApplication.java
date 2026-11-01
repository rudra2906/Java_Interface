package com.system.revision;

class NotificationService
{
	NotificationService()
	{
		sendNotification();
	}
	void sendNotification() 
	{
		System.out.println("NotificationService.sendNotification()");
	}
}
class EmailNotificationService extends NotificationService
{
	

	public EmailNotificationService() {
		super();
		
	}
	String email = "admin@comapany.com";
	@Override
	void sendNotification() 
	{
		System.out.println(email);
	}
}
public class NotificationApplication {

	public static void main(String[] args) {
		new EmailNotificationService();
		new NotificationService();

	}

}
