package br.com.ufrn.agendaaluno.api.model.notifications;

public class EmailNotification extends Notification {
	
	private String emailAdress;

	@Override
	public void send() {
		// TODO Auto-generated method stub
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

}
