package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;

public class HolidayDTO extends DTO {

	@Override
	public Holiday toObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Holiday.class);
	}

	@Override
	public Holiday[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Holiday[].class);
	}
	
}
