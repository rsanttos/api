package br.com.ufrn.agendaaluno.api.service;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.assistent.AssistentStrategy;
import br.com.ufrn.agendaaluno.api.model.assistent.Tip;
import br.com.ufrn.agendaaluno.api.model.user.User;

public class AssistentService {
	private AssistentStrategy assistent;
	private User user;
	
	public AssistentService(AssistentStrategy assistent, User user) {
		this.assistent = assistent;
		this.user = user;
	}
	
	public List<Tip> getTips() {
		return assistent.generateTips(user);
	}

	public AssistentStrategy getAssistent() {
		return assistent;
	}

	public void setAssistent(AssistentStrategy assistent) {
		this.assistent = assistent;
	}
}
