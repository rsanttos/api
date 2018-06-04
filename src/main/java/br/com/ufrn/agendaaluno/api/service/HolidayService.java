package br.com.ufrn.agendaaluno.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dao.HolidayRepository;
import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;
import br.com.ufrn.agendaaluno.api.request.HolidayRequest;

@Service
public class HolidayService {

	@Autowired
	private HolidayRepository holidayRepo;
	
	public HolidayDTO[] getHolidays(String token){
		HolidayRequest hRequest = new HolidayRequest();
		return hRequest.getHolidays(token);
	}
	
	public void save(Holiday holiday) {
		holidayRepo.save(holiday);
	}
}
