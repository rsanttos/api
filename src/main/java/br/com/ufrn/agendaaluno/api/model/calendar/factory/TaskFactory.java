package br.com.ufrn.agendaaluno.api.model.calendar.factory;

import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;
import br.com.ufrn.agendaaluno.api.model.calendar.Task;

public class TaskFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {		
		return new Task();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		TaskDTO tDto = new TaskDTO();
		Task t = tDto.toObject(json);
		t.setFinalDate(t.getData_entrega());
		return t;
	}

}
