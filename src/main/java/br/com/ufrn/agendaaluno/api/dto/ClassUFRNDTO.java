package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;

/**
 * DTO responsável por gerenciar dados de turmas da UFRN recebidos pela API do
 * SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class ClassUFRNDTO extends GenericDTO {

	public static ClassUFRN toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), ClassUFRN.class);
	}

	public static ClassUFRN[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, ClassUFRN[].class);
	}
}
