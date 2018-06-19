package br.com.ufrn.agendaaluno.api.model.user;

public interface UserFactory {

	public User createUser();
	
	public User createUserFromJson(String json);

}
