package br.com.ufrn.agendaaluno.api.dto;

import java.util.List;

import com.google.gson.Gson;

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

	public static String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
}
