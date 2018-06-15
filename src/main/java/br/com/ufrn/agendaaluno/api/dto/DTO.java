package br.com.ufrn.agendaaluno.api.dto;

public abstract class DTO {

	public abstract <T> T toObject(String json);

	public abstract <T> T[] toArrayObject(String json);

	public String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
}
