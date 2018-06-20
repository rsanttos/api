package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dao.PopulateCommitments;
import br.com.ufrn.agendaaluno.api.dto.ProfessorDTO;

public class ProfessorFactory implements UserFactory {

	@Override
	public User createUser() {
		return new Professor();
	}

	@Override
	public User createUserFromJson(String json) {
		ProfessorDTO pDto = new ProfessorDTO();
		Professor p = pDto.toObject(json);
		p.setOrientationMeetings(PopulateCommitments.populateOrientationMeetings(p.getNome()));
		p.setMeetings(PopulateCommitments.populateMeetings());
		return p;
	}

}
