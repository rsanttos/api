package br.com.ufrn.agendaaluno.api.model.user;

/**
 * Classe de modelo para professores
 * 
 * @author ramonsantos
 *
 */
public class Professor extends User {
	private String nome;
	private String cargo;
	private String siape;
	private String unidade;

	public Professor() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}

}
