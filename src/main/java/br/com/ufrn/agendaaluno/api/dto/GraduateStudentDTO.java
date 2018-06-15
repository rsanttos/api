package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;

/**
 * DTO responsável por gerenciar dados de alunos recebidos pela API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class GraduateStudentDTO extends GenericDTO {

	public static GraduateStudent toObject(String json) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			System.out.println(json.charAt(json.length() - 1));
			GraduateStudent[] studentArray = toArrayObject(json);
			if (studentArray != null && studentArray.length == 1) {
				return studentArray[0];
			} else {
				return null;
			}
		} else {
			return gson.fromJson(trataJson(json), GraduateStudent.class);
		}
	}

	public static GraduateStudent[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, GraduateStudent[].class);
	}
}
