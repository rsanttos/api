package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;

public class ClassUFRNDTO extends DTO {
	
	@Override
	public ClassUFRN toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), ClassUFRN.class);
	}
	
	@Override
	public ClassUFRN[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, ClassUFRN[].class);
	}
}
