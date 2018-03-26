package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.Holiday;

public class CalendarDTO {

	private int ano;
	private long fim_matricula_extraordinaria;
	private long fim_matricula_online;
	private long fim_periodo;
	private long inicio_matricula_online;
	private long inicio_periodo;
	private long inicio_rematricula;
	private HolidayDTO[] holidays;
	public CalendarDTO() {
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
	public HolidayDTO[] getHolidays() {
		return holidays;
	}
	public void setHolidays(HolidayDTO[] holidays) {
		this.holidays = holidays;
	}
	public String toJson() {
		Gson gson = new Gson();		
		return gson.toJson(this);
	}
	
	public static CalendarDTO toObject(String json) {
		Gson gson = new Gson();		
		
		return gson.fromJson(trataJson(json), CalendarDTO.class);
	}
	
	public static String trataJson(String json) {
		if(json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
	
}
