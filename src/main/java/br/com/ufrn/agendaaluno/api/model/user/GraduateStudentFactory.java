package br.com.ufrn.agendaaluno.api.model.user;

public class GraduateStudentFactory implements UserFactory {

	@Override
	public User createUser() {
		return new GraduateStudent();
	}

}
