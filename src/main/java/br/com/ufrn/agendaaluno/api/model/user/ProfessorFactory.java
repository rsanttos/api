package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.ProfessorDTO;

public class ProfessorFactory implements UserFactory {

	@Override
	public User createUser() {
		return new Professor();
	}

	@Override
	public User createUserFromJson(String json) {
		ProfessorDTO pDto = new ProfessorDTO();
		return pDto.toObject(json);
	}

}
