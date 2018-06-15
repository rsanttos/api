package br.com.ufrn.agendaaluno.api.model.notifications;

/**
 * Classe para notificações por SMS
 * 
 * @author ramonsantos
 *
 */
public class SMSNotification extends Notification {

	private String smsNumber;

	@Override
	public void send() {
		// TODO Auto-generated method stub

	}

	public String getSmsNumber() {
		return smsNumber;
	}

	public void setSmsNumber(String smsNumber) {
		this.smsNumber = smsNumber;
	}

}
