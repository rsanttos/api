package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;

public class UndergraduateStudentDTO extends DTO {
	
	@Override
	public UndergraduateStudent toObject(String json) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			System.out.println(json.charAt(json.length() - 1));
			UndergraduateStudent[] studentArray = toArrayObject(json);
			if (studentArray != null && studentArray.length == 1) {
				return studentArray[0];
			} else {
				return null;
			}
		} else {
			return gson.fromJson(trataJson(json), UndergraduateStudent.class);
		}
	}
	@Override
	public UndergraduateStudent[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, UndergraduateStudent[].class);
	}
}
