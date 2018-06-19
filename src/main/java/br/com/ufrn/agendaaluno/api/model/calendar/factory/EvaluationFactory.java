package br.com.ufrn.agendaaluno.api.model.calendar.factory;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;
import br.com.ufrn.agendaaluno.api.model.calendar.Evaluation;

public class EvaluationFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {
		return new Evaluation();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		EvaluationDTO eDto = new EvaluationDTO();
		Evaluation e = eDto.toObject(json);
		e.setFinalDate(e.getData());
		return e;
	}

}
