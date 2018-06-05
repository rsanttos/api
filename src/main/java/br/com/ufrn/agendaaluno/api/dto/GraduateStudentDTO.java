package br.com.ufrn.agendaaluno.api.dto;

import com.google.gson.Gson;

import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;

public class GraduateStudentDTO extends GenericDTO {

	private int ano_ingresso;
	private String cpf_cnpj;
	private int id_curso;
	private int id_discente;
	private long matricula;
	private String nome_curso;
	private String nome_discente;
	private int periodo_ingresso;
	private String sigla_nivel;
	
	public int getAno_ingresso() {
		return ano_ingresso;
	}
	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}
	public String getCpf_cnpj() {
		return cpf_cnpj;
	}
	public void setCpf_cnpj(String cpf_cnpj) {
		this.cpf_cnpj = cpf_cnpj;
	}
	public int getId_curso() {
		return id_curso;
	}
	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}
	public int getId_discente() {
		return id_discente;
	}
	public void setId_discente(int id_discente) {
		this.id_discente = id_discente;
	}
	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNome_curso() {
		return nome_curso;
	}
	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}
	public String getNome_discente() {
		return nome_discente;
	}
	public void setNome_discente(String nome_discente) {
		this.nome_discente = nome_discente;
	}
	public int getPeriodo_ingresso() {
		return periodo_ingresso;
	}
	public void setPeriodo_ingresso(int periodo_ingresso) {
		this.periodo_ingresso = periodo_ingresso;
	}
	public String getSigla_nivel() {
		return sigla_nivel;
	}
	public void setSigla_nivel(String sigla_nivel) {
		this.sigla_nivel = sigla_nivel;
	}
	
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
