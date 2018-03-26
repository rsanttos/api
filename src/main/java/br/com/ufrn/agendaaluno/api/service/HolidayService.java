package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.HolidayDTO;
import br.com.ufrn.agendaaluno.api.request.HolidayRequest;

@Service
public class HolidayService {

	public HolidayDTO[] getHolidays(String token){
		HolidayRequest hRequest = new HolidayRequest();
		return hRequest.getHolidays(token);
	}
}
