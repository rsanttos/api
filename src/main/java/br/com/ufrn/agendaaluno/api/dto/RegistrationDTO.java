package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

/**
 * DTO responsável por gerenciar dados de matrículas recebidos pela API do
 * SIGAA.
 * 
 * @author ramonsantos
 *
 */
public class RegistrationDTO {
	private int id_discente;
	private int id_situacao_solicitacao;
	private int id_turma;

	public RegistrationDTO() {
		super();
	}

	public int getId_discente() {
		return id_discente;
	}

	public void setId_discente(int id_discente) {
		this.id_discente = id_discente;
	}

	public int getId_situacao_solicitacao() {
		return id_situacao_solicitacao;
	}

	public void setId_situacao_solicitacao(int id_situacao_solicitacao) {
		this.id_situacao_solicitacao = id_situacao_solicitacao;
	}

	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static RegistrationDTO toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), RegistrationDTO.class);
	}

	public static RegistrationDTO[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, RegistrationDTO[].class);
	}

	public static String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
}
