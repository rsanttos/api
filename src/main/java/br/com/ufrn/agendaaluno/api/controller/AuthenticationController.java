package br.com.ufrn.agendaaluno.api.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Classe responsável por receber e tratar requisições relacionadas a
 * autenticação na API do SIGAA.
 * 
 * @author ramonsantos
 *
 */
@RestController
public class AuthenticationController {
	/**
	 * Método de teste
	 * 
	 * @param session
	 * @param model
	 * @return
	 */
	@GetMapping("/authentication")
	public String test(HttpSession session, Model model) {
		return "teste";
	}
}
