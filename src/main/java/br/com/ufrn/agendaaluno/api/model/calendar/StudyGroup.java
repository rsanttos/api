package br.com.ufrn.agendaaluno.api.model.calendar;

public class StudyGroup extends Commitment {
	private String sala;
	private String disciplina;

	public StudyGroup() {
		super();
	}

	public StudyGroup(String sala, String disciplina, long finalDate) {
		super();
		this.sala = sala;
		this.disciplina = disciplina;
		this.finalDate = finalDate;
	}

	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}
