package br.com.ufrn.agendaaluno.api.model.calendar;

public class Meeting extends Commitment {
	private String assunto;
	private String pauta;
	private String sala;

	public Meeting(String assunto, String pauta, String sala, long finalDate) {
		super();
		this.assunto = assunto;
		this.pauta = pauta;
		this.sala = sala;
		this.finalDate = finalDate;
	}

	public Meeting() {
		super();
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getPauta() {
		return pauta;
	}

	public void setPauta(String pauta) {
		this.pauta = pauta;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}
