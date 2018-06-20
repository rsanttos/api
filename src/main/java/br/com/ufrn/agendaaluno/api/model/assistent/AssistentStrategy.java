package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;

public interface AssistentStrategy {
	public List<Tip> generateTips(ClassUFRN classesUFRN[]);
}
