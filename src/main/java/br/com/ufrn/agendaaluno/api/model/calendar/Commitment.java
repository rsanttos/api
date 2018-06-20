package br.com.ufrn.agendaaluno.api.model.calendar;

public abstract class Commitment {
	protected long finalDate;

	public long getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(long finalDate) {
		this.finalDate = finalDate;
	}

}
