package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.GraduateStudentDTO;

public class GraduateStudentFactory implements UserFactory {

	@Override
	public User createUser() {
		return new GraduateStudent();
	}

	public User createUser(GraduateStudentDTO gsDto) {
		GraduateStudent graduateStudent = new GraduateStudent();
		graduateStudent.setCpf_cnpj(gsDto.getCpf_cnpj());
		graduateStudent.setNome_discente(gsDto.getNome_discente());
		graduateStudent.setAno_ingresso(gsDto.getAno_ingresso());
		graduateStudent.setId_curso(gsDto.getId_curso());
		graduateStudent.setId_discente(gsDto.getId_discente());
		graduateStudent.setMatricula(gsDto.getMatricula());
		graduateStudent.setNome_curso(gsDto.getNome_curso());
		graduateStudent.setPeriodo_ingresso(gsDto.getPeriodo_ingresso());
		graduateStudent.setSigla_nivel(gsDto.getSigla_nivel());
		return graduateStudent;
	}

}
