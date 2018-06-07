package br.com.ufrn.agendaaluno.api.model.notifications;

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
