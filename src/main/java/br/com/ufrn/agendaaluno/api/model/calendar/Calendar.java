package br.com.ufrn.agendaaluno.api.model.calendar;

public class Calendar {
	private int ano;
	private long inicio_matricula_online;
	private long inicio_periodo;
	private long inicio_rematricula;
	private long inicio_matricula_extraordinaria;
	private long fim_matricula_extraordinaria;
	private long fim_matricula_online;
	private long fim_periodo;
	private long fim_rematricula;

	private Holiday[] holidays;

	public Calendar() {
		super();
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public long getFim_matricula_extraordinaria() {
		return fim_matricula_extraordinaria;
	}

	public void setFim_matricula_extraordinaria(long fim_matricula_extraordinaria) {
		this.fim_matricula_extraordinaria = fim_matricula_extraordinaria;
	}

	public long getFim_matricula_online() {
		return fim_matricula_online;
	}

	public void setFim_matricula_online(long fim_matricula_online) {
		this.fim_matricula_online = fim_matricula_online;
	}

	public long getFim_periodo() {
		return fim_periodo;
	}

	public void setFim_periodo(long fim_periodo) {
		this.fim_periodo = fim_periodo;
	}

	public long getInicio_matricula_online() {
		return inicio_matricula_online;
	}

	public void setInicio_matricula_online(long inicio_matricula_online) {
		this.inicio_matricula_online = inicio_matricula_online;
	}

	public long getInicio_periodo() {
		return inicio_periodo;
	}

	public void setInicio_periodo(long inicio_periodo) {
		this.inicio_periodo = inicio_periodo;
	}

	public long getInicio_rematricula() {
		return inicio_rematricula;
	}

	public void setInicio_rematricula(long inicio_rematricula) {
		this.inicio_rematricula = inicio_rematricula;
	}

	public long getInicio_matricula_extraordinaria() {
		return inicio_matricula_extraordinaria;
	}

	public void setInicio_matricula_extraordinaria(long inicio_matricula_extraordinaria) {
		this.inicio_matricula_extraordinaria = inicio_matricula_extraordinaria;
	}

	public long getFim_rematricula() {
		return fim_rematricula;
	}

	public void setFim_rematricula(long fim_rematricula) {
		this.fim_rematricula = fim_rematricula;
	}

	public Holiday[] getHolidays() {
		return holidays;
	}

	public void setHolidays(Holiday[] holidays) {
		this.holidays = holidays;
	}

}
