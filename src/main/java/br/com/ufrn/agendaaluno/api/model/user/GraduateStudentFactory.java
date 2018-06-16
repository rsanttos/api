package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.GraduateStudentDTO;

public class GraduateStudentFactory implements UserFactory {

	@Override
	public User createUserFromJson(String json) {
		GraduateStudentDTO gsDto = new GraduateStudentDTO();
		return gsDto.toObject(json);
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new GraduateStudent();
	}

}
