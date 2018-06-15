package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.request.AuthenticationRequest;

/**
 * Classe de serviço responsável pela intermediação entre os controllers e as
 * requisições
 * 
 * @author ramonsantos
 *
 */
@Service
public class AuthenticationService {

	public AuthenticationDTO authenticate() {
		AuthenticationRequest authRequest = new AuthenticationRequest();
		AuthenticationDTO authDto = authRequest.authenticate();
		System.out.println(authDto.getAccess_token());
		return authDto;
	}
}
