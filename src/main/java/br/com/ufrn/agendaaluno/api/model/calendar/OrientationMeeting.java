package br.com.ufrn.agendaaluno.api.model.calendar;

public class OrientationMeeting extends Commitment {
	private String nomeOrientador;
	private String nomeOrientando;
	private String sala;

	public OrientationMeeting(String nomeOrientador, String nomeOrientando, String sala, long finalDate) {
		super();
		this.nomeOrientador = nomeOrientador;
		this.nomeOrientando = nomeOrientando;
		this.sala = sala;
		this.finalDate = finalDate;
	}

	public OrientationMeeting() {
		super();
	}

	public String getNomeOrientador() {
		return nomeOrientador;
	}

	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}

	public String getNomeOrientando() {
		return nomeOrientando;
	}

	public void setNomeOrientando(String nomeOrientando) {
		this.nomeOrientando = nomeOrientando;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

}
