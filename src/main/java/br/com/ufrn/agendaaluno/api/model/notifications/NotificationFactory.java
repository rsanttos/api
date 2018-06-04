package br.com.ufrn.agendaaluno.api.model.notifications;

public interface NotificationFactory {
	public Notification createEmailNotification();
	
	public Notification createSMSNotification();
}
