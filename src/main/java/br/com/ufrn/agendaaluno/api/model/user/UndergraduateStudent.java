package br.com.ufrn.agendaaluno.api.model.user;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.StudyGroup;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;

public class UndergraduateStudent extends Student {
	private int ano_ingresso;
	private int id_curso;
	private String nome_curso;
	private int periodo_ingresso;

	private ClassUFRN[] classes;

	private List<StudyGroup> studiesGroup;

	public UndergraduateStudent() {
		super();
	}

	public UndergraduateStudent(int ano_ingresso, int id_curso, String nome_curso, int periodo_ingresso) {
		super();
		this.ano_ingresso = ano_ingresso;
		this.id_curso = id_curso;
		this.nome_curso = nome_curso;
		this.periodo_ingresso = periodo_ingresso;
	}

	public int getAno_ingresso() {
		return ano_ingresso;
	}

	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}

	public int getId_curso() {
		return id_curso;
	}

	public void setId_curso(int id_curso) {
		this.id_curso = id_curso;
	}

	public String getNome_curso() {
		return nome_curso;
	}

	public void setNome_curso(String nome_curso) {
		this.nome_curso = nome_curso;
	}

	public int getPeriodo_ingresso() {
		return periodo_ingresso;
	}

	public void setPeriodo_ingresso(int periodo_ingresso) {
		this.periodo_ingresso = periodo_ingresso;
	}

	public ClassUFRN[] getClasses() {
		return classes;
	}

	public void setClasses(ClassUFRN[] classes) {
		this.classes = classes;
	}

	public List<StudyGroup> getStudiesGroup() {
		return studiesGroup;
	}

	public void setStudiesGroup(List<StudyGroup> studiesGroup) {
		this.studiesGroup = studiesGroup;
	}

}
