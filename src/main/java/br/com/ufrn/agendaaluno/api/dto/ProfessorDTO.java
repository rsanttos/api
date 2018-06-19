package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.Professor;

public class ProfessorDTO extends DTO {

	@Override
	public Professor toObject(String json) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			System.out.println(json.charAt(json.length() - 1));
			Professor[] professorArray = toArrayObject(json);
			if (professorArray != null && professorArray.length == 1) {
				return professorArray[0];
			} else {
				return null;
			}
		} else {
			return gson.fromJson(trataJson(json), Professor.class);
		}
	}

	@Override
	public Professor[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Professor[].class);
	}

}
