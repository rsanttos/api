package br.com.ufrn.agendaaluno.api.model.user;

public class Student extends User {

	private int id_discente;
	private long matricula;
	private String nome_discente;
	private String sigla_nivel;

	public int getId_discente() {
		return id_discente;
	}

	public void setId_discente(int id_discente) {
		this.id_discente = id_discente;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public String getNome_discente() {
		return nome_discente;
	}

	public void setNome_discente(String nome_discente) {
		this.nome_discente = nome_discente;
	}

	public String getSigla_nivel() {
		return sigla_nivel;
	}

	public void setSigla_nivel(String sigla_nivel) {
		this.sigla_nivel = sigla_nivel;
	}
}
