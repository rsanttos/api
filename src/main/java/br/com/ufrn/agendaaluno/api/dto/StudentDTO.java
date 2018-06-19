package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.Student;

public class StudentDTO extends DTO {

	@Override
	public Student toObject(String json) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			System.out.println(json.charAt(json.length() - 1));
			Student[] studentArray = toArrayObject(json);
			if (studentArray != null && studentArray.length == 1) {
				return studentArray[0];
			} else {
				return null;
			}
		} else {
			return gson.fromJson(trataJson(json), Student.class);
		}
	}
	@Override
	public Student[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Student[].class);
	}

	
}
