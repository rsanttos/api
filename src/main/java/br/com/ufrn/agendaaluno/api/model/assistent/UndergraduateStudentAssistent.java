package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;

public class UndergraduateStudentAssistent implements AssistentStrategy<UndergraduateStudent> {
	@Override
	public List<Tip> generateTips(UndergraduateStudent student) {
		// TODO
		return null;
	}

}
