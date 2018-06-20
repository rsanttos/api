package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dao.PopulateCommitments;
import br.com.ufrn.agendaaluno.api.dto.UndergraduateStudentDTO;

public class UndergraduateStudentFactory implements UserFactory {

	@Override
	public User createUserFromJson(String json) {
		UndergraduateStudentDTO ugsDto = new UndergraduateStudentDTO();
		UndergraduateStudent ugs = ugsDto.toObject(json);
		ugs.setStudiesGroup(PopulateCommitments.populateStudiesGroup());
		return ugs;
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new UndergraduateStudent();
	}

}
