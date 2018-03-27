package br.com.ufrn.agendaaluno.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Holiday {
	@Id
	@GeneratedValue
	@Column(name = "id_holiday")
	private long idHoliday;
	
	private long dataFeriado;
	private String descricao;
	@ManyToOne
	@JoinColumn(name = "id_calendar")
	private Calendar calendar;

	public Holiday() {
		super();
	}

	public long getIdHoliday() {
		return idHoliday;
	}

	public void setIdHoliday(long idHoliday) {
		this.idHoliday = idHoliday;
	}

	public long getDataFeriado() {
		return dataFeriado;
	}

	public void setDataFeriado(long dataFeriado) {
		this.dataFeriado = dataFeriado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
