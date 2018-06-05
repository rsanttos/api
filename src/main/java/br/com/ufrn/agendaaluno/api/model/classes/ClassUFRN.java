package br.com.ufrn.agendaaluno.api.model.classes;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.dto.TaskDTO;

public class ClassUFRN {
	private int id_turma;
	private String local;
	private String descricao_horario;
	private String nome_componente;
	private String codigo_componente;
	private int id_situacao_solicitacao;

	private Task[] tasks;
	private Evaluation[] evaluations;

	public ClassUFRN() {
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

}
