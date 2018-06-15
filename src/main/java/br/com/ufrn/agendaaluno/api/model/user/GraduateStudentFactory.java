package br.com.ufrn.agendaaluno.api.model.user;

/**
 * Classe para criação de alunos
 * 
 * @author ramonsantos
 *
 */
public class GraduateStudentFactory implements UserFactory {

	@Override
	public User createUser() {
		return new GraduateStudent();
	}

}
