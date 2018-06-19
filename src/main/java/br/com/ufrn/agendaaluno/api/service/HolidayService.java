package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.model.calendar.Holiday;
import br.com.ufrn.agendaaluno.api.model.calendar.factory.HolidayFactory;
import br.com.ufrn.agendaaluno.api.request.HolidayRequest;

@Service
public class HolidayService {
//
//	@Autowired
//	private HolidayRepository holidayRepo;
	
	public Holiday[] getHolidays(String token){
		HolidayRequest hRequest = new HolidayRequest();
		String holidaysStr = hRequest.getHolidays(token);
		HolidayFactory hFactory = new HolidayFactory();
		return (Holiday[]) hFactory.createArrayHolidayFromJson(holidaysStr);
	}
	
//	public void save(Holiday holiday) {
//		holidayRepo.save(holiday);
//	}
}
