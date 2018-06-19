package br.com.ufrn.agendaaluno.api.model.calendar.factory;

import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Commitment;
import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;

public class HolidayFactory implements CommitmentFactory {

	@Override
	public Commitment createCommitment() {
		return new Holiday();
	}

	@Override
	public Commitment createCommitmentFromJson(String json) {
		HolidayDTO hDto = new HolidayDTO();
		Holiday h = hDto.toObject(json);		
		h.setFinalDate(h.getData_feriado());
		return h;
	}
	
	public Commitment[] createArrayHolidayFromJson(String json) {
		HolidayDTO hDto = new HolidayDTO();
		Holiday[] holidays = hDto.toArrayObject(json);
		for(int i = 0 ; i < holidays.length ; i++) {
			holidays[i].setFinalDate(holidays[i].getData_feriado());
		}
		return holidays;
	}

}
