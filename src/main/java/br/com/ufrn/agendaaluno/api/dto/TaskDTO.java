package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.classes.Task;

/**
 * DTO responsável por gerenciar dados de tarefas recebidos pela API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class TaskDTO extends GenericDTO {

	public static Task toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), Task.class);
	}

	public static Task[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, Task[].class);
	}
}
