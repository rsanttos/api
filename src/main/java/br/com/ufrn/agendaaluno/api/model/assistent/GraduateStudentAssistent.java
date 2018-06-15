package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

/**
 * Interface para implementar o padrão Strategy para o Assistente Virtual para
 * alunos
 * 
 * @author ramonsantos
 *
 */
public class GraduateStudentAssistent implements AssistentStrategy {

	@Override
	public Tip generateTips(List<Commitment> commitments) {
		// TODO Auto-generated method stub
		return new GraduateStudentTip();
	}

}
