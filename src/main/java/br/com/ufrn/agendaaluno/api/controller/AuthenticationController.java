package br.com.ufrn.agendaaluno.api.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

	@GetMapping("/authentication")
	public String test(HttpSession session, Model model) {
		return "teste";
	}
}
