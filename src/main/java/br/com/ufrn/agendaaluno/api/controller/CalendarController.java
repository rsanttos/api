package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.AuthenticationDTO;
import br.com.ufrn.agendaaluno.api.request.AuthenticationRequest;

@RestController
public class CalendarController {
	
	@RequestMapping(value = "/calendario", method = RequestMethod.GET)
	public AuthenticationDTO getCalendar() {
		AuthenticationRequest authRequest = new AuthenticationRequest();
		AuthenticationDTO authDto = authRequest.authenticate();
		System.out.println(authDto.getAccess_token());
		return authDto;
	}
}
