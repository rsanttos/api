package br.com.ufrn.agendaaluno.api.model.classes;

public class Evaluation {

	private int id_avaliacao;
	private String nomeComponente;
	private long data;
	private String hora;
	private String descricao;	
	
	public Evaluation() {
		super();
	}
	public int getId_avaliacao() {
		return id_avaliacao;
	}
	public void setId_avaliacao(int id_avaliacao) {
		this.id_avaliacao = id_avaliacao;
	}
	public String getNomeComponente() {
		return nomeComponente;
	}
	public void setNomeComponente(String nomeComponente) {
		this.nomeComponente = nomeComponente;
	}
	public long getData() {
		return data;
	}
	public void setData(long data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
