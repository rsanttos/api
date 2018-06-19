package br.com.ufrn.agendaaluno.api.model.calendar;

public class Holiday extends Commitment {
	private long data_feriado;
	private String descricao;

	public Holiday() {
		super();
	}

	public long getData_feriado() {
		return data_feriado;
	}

	public void setData_feriado(long data_feriado) {
		this.data_feriado = data_feriado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
