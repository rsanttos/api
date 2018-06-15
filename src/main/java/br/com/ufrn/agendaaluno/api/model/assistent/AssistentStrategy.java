package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

/**
 * Interface para implementar o padrão Strategy para o Assistente Virtual
 * 
 * @author ramonsantos
 *
 */
public interface AssistentStrategy {
	public Tip generateTips(List<Commitment> commitments);
}
