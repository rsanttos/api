package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.List;

import br.com.ufrn.agendaaluno.api.model.user.User;

public interface AssistentStrategy<T extends User> {
	public List<Tip> generateTips(T user);
}
