package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.UndergraduateStudentDTO;

public class UndergraduateStudentFactory implements UserFactory {

	@Override
	public User createUserFromJson(String json) {
		UndergraduateStudentDTO ugsDto = new UndergraduateStudentDTO();
		return ugsDto.toObject(json);
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new UndergraduateStudent();
	}

}
