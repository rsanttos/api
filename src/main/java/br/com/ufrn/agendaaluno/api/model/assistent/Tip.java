package br.com.ufrn.agendaaluno.api.model.assistent;

import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;

public abstract class Tip {
	private Commitment commitment;
	private TipType type;
	
	public Tip(Commitment commitment, TipType type) {
		this.commitment = commitment;
		this.type = type;
	}
	
	public Commitment getCommitment() {
		return commitment;
	}
	
	public void setCommitment(Commitment commitment) {
		this.commitment = commitment;
	}
	
	public TipType getTipType() {
		return type;
	}
	
	public void setText(TipType type) {
		this.type = type;
	}
}
