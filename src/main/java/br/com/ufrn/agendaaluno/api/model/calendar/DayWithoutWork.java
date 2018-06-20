package br.com.ufrn.agendaaluno.api.model.calendar;

public class DayWithoutWork extends Commitment {
	private String justificativa;

	public DayWithoutWork(String justificativa, long finalDate) {
		super();
		this.justificativa = justificativa;
		this.finalDate = finalDate;
	}

	public DayWithoutWork() {
		super();
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

}
