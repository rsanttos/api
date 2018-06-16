package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.User;

public class UserDTO extends DTO {

	@Override
	public User toObject(String json) {
		Gson gson = new Gson();

		if (json.startsWith("[")) {
			System.out.println(json.charAt(json.length() - 1));
			User[] userArray = toArrayObject(json);
			if (userArray != null && userArray.length == 1) {
				return userArray[0];
			} else {
				return null;
			}
		} else {
			return gson.fromJson(trataJson(json), User.class);
		}
	}

	@Override
	public User[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, User[].class);
	}
}
