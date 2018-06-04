package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

public interface AssistentStrategy {
	public Tip generateTips(List<Commitment> commitments);
}
