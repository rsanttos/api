package br.com.ufrn.agendaaluno.api.model.calendar;

public abstract class Commitment {
	private long date;

	public Commitment() {
	}
	
	public Commitment(long date) {
		this.date = date;
	}
	
	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}
}
