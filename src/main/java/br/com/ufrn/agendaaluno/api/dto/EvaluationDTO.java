package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;

public class EvaluationDTO extends DTO {

	@Override
	public Evaluation toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), Evaluation.class);
	}

	@Override
	public Evaluation[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Evaluation[].class);
	}

}
