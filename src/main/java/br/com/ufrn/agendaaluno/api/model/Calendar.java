package br.com.ufrn.agendaaluno.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Calendar {
	@Id
	@GeneratedValue
	@Column(name = "id_calendar")
	private long idCalendar;
	
	private int ano;
	private long fimMatriculaExtraordinaria;
	private long fimMatriculaOnline;
	private long fimPeriodo;
	private long inicioMatriculaOnline;
	private long inicioPeriodo;
	private long inicioRematricula;
	
	@OneToMany(mappedBy = "calendar", targetEntity = Holiday.class, fetch = FetchType.LAZY)
	private List<Holiday> holidays;
	
	public Calendar() {
		super();
	}


	public long getIdCalendar() {
		return idCalendar;
	}


	public void setIdCalendar(long idCalendar) {
		this.idCalendar = idCalendar;
	}


	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public long getFimMatriculaExtraordinaria() {
		return fimMatriculaExtraordinaria;
	}

	public void setFimMatriculaExtraordinaria(long fimMatriculaExtraordinaria) {
		this.fimMatriculaExtraordinaria = fimMatriculaExtraordinaria;
	}

	public long getFimMatriculaOnline() {
		return fimMatriculaOnline;
	}

	public void setFimMatriculaOnline(long fimMatriculaOnline) {
		this.fimMatriculaOnline = fimMatriculaOnline;
	}

	public long getFimPeriodo() {
		return fimPeriodo;
	}

	public void setFimPeriodo(long fimPeriodo) {
		this.fimPeriodo = fimPeriodo;
	}

	public long getInicioMatriculaOnline() {
		return inicioMatriculaOnline;
	}

	public void setInicioMatriculaOnline(long inicioMatriculaOnline) {
		this.inicioMatriculaOnline = inicioMatriculaOnline;
	}

	public long getInicioPeriodo() {
		return inicioPeriodo;
	}

	public void setInicioPeriodo(long inicioPeriodo) {
		this.inicioPeriodo = inicioPeriodo;
	}

	public long getInicioRematricula() {
		return inicioRematricula;
	}

	public void setInicioRematricula(long inicioRematricula) {
		this.inicioRematricula = inicioRematricula;
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

}
