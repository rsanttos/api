package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.StudentDTO;

public class StudentFactory implements UserFactory {


	@Override
	public User createUserFromJson(String json) {
		StudentDTO sDto = new StudentDTO();
		return sDto.toObject(json);
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new GraduateStudent();
	}

}
