package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;

/**
 * DTO responsável por gerenciar dados de feriados recebidos pela API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class HolidayDTO {
	private long data_feriado;
	private String descricao;

	public HolidayDTO() {
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

	public static HolidayDTO toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), HolidayDTO.class);
	}

	public static HolidayDTO[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, HolidayDTO[].class);
	}

	public Holiday toEntity() {
		Holiday holiday = new Holiday();
		holiday.setDate(this.data_feriado);
		holiday.setDescription(this.descricao);
		return holiday;
	}

	public static String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
}
