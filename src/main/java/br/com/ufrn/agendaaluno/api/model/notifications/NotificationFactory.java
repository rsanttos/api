package br.com.ufrn.agendaaluno.api.model.notifications;

/**
 * Interface para criação de notificações
 * 
 * @author ramonsantos
 *
 */
public interface NotificationFactory {
	public Notification createEmailNotification();

	public Notification createSMSNotification();
}
