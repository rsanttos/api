package br.com.ufrn.agendaaluno.api.dto;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.model.classes.Task;

public class ClassDTO {
	private int id_turma;
	private String local;
	private String descricao_horario;
	private String nome_componente;
	private String codigo_componente;
	private int id_situacao_solicitacao;
	
	private Task[] tasks;
	private Evaluation[] evaluations;

	public ClassDTO() {
		super();
	}

	public int getId_turma() {
		return id_turma;
	}

	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getDescricao_horario() {
		return descricao_horario;
	}

	public void setDescricao_horario(String descricao_horario) {
		this.descricao_horario = descricao_horario;
	}

	public String getNome_componente() {
		return nome_componente;
	}

	public void setNome_componente(String nome_componente) {
		this.nome_componente = nome_componente;
	}

	public String getCodigo_componente() {
		return codigo_componente;
	}

	public void setCodigo_componente(String codigo_componente) {
		this.codigo_componente = codigo_componente;
	}

	public int getId_situacao_solicitacao() {
		return id_situacao_solicitacao;
	}

	public void setId_situacao_solicitacao(int id_situacao_solicitacao) {
		this.id_situacao_solicitacao = id_situacao_solicitacao;
	}

	public Task[] getTasks() {
		return tasks;
	}

	public void setTasks(Task[] tasks) {
		this.tasks = tasks;
	}

	public Evaluation[] getEvaluations() {
		return evaluations;
	}

	public void setEvaluations(Evaluation[] evaluations) {
		this.evaluations = evaluations;
	}

	public String toJson() {
		Gson gson = new Gson();
		return gson.toJson(this);
	}

	public static ClassDTO toObject(String json) {
		Gson gson = new Gson();

		return gson.fromJson(trataJson(json), ClassDTO.class);
	}

	public static ClassDTO[] toArrayObject(String json) {
		Gson gson = new Gson();
		json = trataJson(json);
		return gson.fromJson(json, ClassDTO[].class);
	}
	
	public static List<ClassDTO> staticToDynamic(ClassDTO[] statico){
		List<ClassDTO> dinamico = new ArrayList<ClassDTO>();
		for(int i = 0 ; i < statico.length ; i++) {
			dinamico.add(statico[i]);
		}
		
		return dinamico;
	}

	public static String trataJson(String json) {
		if (json.contains("-")) {
			return json.replace("-", "_");
		} else {
			return json;
		}
	}
}
