package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dao.PopulateCommitments;
import br.com.ufrn.agendaaluno.api.dto.GraduateStudentDTO;

public class GraduateStudentFactory implements UserFactory {

	@Override
	public User createUserFromJson(String json) {
		GraduateStudentDTO gsDto = new GraduateStudentDTO();
		GraduateStudent gs = gsDto.toObject(json);
		gs.setMeetings(PopulateCommitments.populateMeetings());
		gs.setDaysWithoutwork(PopulateCommitments.populateDaysWithoutWork());
		gs.setStudiesGroup(PopulateCommitments.populateStudiesGroup());
		return gs;
	}

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new GraduateStudent();
	}

}
