package br.com.ufrn.agendaaluno.api.service;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.assistent.AssistentStrategy;
import br.com.ufrn.agendaaluno.api.model.assistent.Tip;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;

public class AssistentService {
	private AssistentStrategy assistent;
	private ClassUFRN classesUFRN[];
	
	public AssistentService(AssistentStrategy assistent, ClassUFRN classesUFRN[]) {
		this.assistent = assistent;
		this.classesUFRN = classesUFRN;
	}
	
	public List<Tip> getTips() {
		return assistent.generateTips(classesUFRN);
	}

	public AssistentStrategy getAssistent() {
		return assistent;
	}

	public void setAssistent(AssistentStrategy assistent) {
		this.assistent = assistent;
	}
}
