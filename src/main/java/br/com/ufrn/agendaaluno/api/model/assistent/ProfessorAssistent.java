package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

/**
 * Classe para implementar o padrão Strategy para o Assistente Virtual para
 * professores
 * 
 * @author ramonsantos
 *
 */
public class ProfessorAssistent implements AssistentStrategy {

	@Override
	public Tip generateTips(List<Commitment> commitments) {
		// TODO Auto-generated method stub
		return new ProfessorTip();
	}

}
