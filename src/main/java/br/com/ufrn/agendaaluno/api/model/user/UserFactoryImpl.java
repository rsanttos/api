package br.com.ufrn.agendaaluno.api.model.user;

import br.com.ufrn.agendaaluno.api.dto.UserDTO;

public class UserFactoryImpl implements UserFactory {

	@Override
	public User createUser() {
		// TODO Auto-generated method stub
		return new User();
	}

	@Override
	public User createUserFromJson(String json) {
		// TODO Auto-generated method stub
		UserDTO uDTO = new UserDTO();
		return uDTO.toObject(json);
	}

}
