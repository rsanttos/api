package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.request.AuthenticationRequest;

@Service
public class AuthenticationService {
	
	public AuthenticationDTO authenticate() {
		AuthenticationRequest authRequest = new AuthenticationRequest();
		AuthenticationDTO authDto = authRequest.authenticate();
		System.out.println(authDto.getAccess_token());
		return authDto;
	}
}
