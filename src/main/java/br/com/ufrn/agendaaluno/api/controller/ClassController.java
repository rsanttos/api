package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;
import br.com.ufrn.agendaaluno.api.request.ClassRequest;

@RestController
public class ClassController {
	@RequestMapping(value = "/class/{idStudent}", method = RequestMethod.GET)
	public ClassDTO[] getClassStudent(@PathVariable String idStudent) {
		ClassRequest classRequest = new ClassRequest();
		return null;
	}
	
}
