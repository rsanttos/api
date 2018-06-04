package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

public class UnderGraduateStudentAssistent implements AssistentStrategy {

	@Override
	public Tip generateTips(List<Commitment> commitments) {
		// TODO Auto-generated method stub
		return new UndergraduateStudentTip();
	}

}
