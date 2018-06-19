package br.com.ufrn.agendaaluno.api.model.calendar.factory;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

public abstract interface CommitmentFactory {

	public Commitment createCommitment();
	
	public Commitment createCommitmentFromJson(String json);
	
}
