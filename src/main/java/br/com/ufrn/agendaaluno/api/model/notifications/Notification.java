package br.com.ufrn.agendaaluno.api.model.notifications;

/**
 * Classe abstrata para notificações
 * 
 * 
 * @author ramonsantos
 *
 */
public abstract class Notification {
	private String message;

	public abstract void send();

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
