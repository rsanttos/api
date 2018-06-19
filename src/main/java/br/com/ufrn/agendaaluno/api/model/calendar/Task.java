package br.com.ufrn.agendaaluno.api.model.calendar;

public class Task extends Commitment {
	private int id_turma;
	private String nomeComponente;
	private String titulo;
	private String conteudo;
	private long data_inicio;
	private long data_entrega;
	private int hora_inicio;
	private int hora_entrega;
	private int minuto_inicio;
	private int minuto_entrega;

	public Task() {
		super();
	}

	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public String getNomeComponente() {
		return nomeComponente;
	}

	public void setNomeComponente(String nomeComponente) {
		this.nomeComponente = nomeComponente;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public long getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(long data_inicio) {
		this.data_inicio = data_inicio;
	}

	public long getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(long data_entrega) {
		this.data_entrega = data_entrega;
	}

	public int getHora_inicio() {
		return hora_inicio;
	}

	public void setHora_inicio(int hora_inicio) {
		this.hora_inicio = hora_inicio;
	}

	public int getHora_entrega() {
		return hora_entrega;
	}

	public void setHora_entrega(int hora_entrega) {
		this.hora_entrega = hora_entrega;
	}

	public int getMinuto_inicio() {
		return minuto_inicio;
	}

	public void setMinuto_inicio(int minuto_inicio) {
		this.minuto_inicio = minuto_inicio;
	}

	public int getMinuto_entrega() {
		return minuto_entrega;
	}

	public void setMinuto_entrega(int minuto_entrega) {
		this.minuto_entrega = minuto_entrega;
	}
}
