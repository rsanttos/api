package br.com.ufrn.agendaaluno.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrn.agendaaluno.api.model.calendar.Calendar;

public interface CalendarRepository extends CrudRepository<Calendar, Long> {
	public Calendar findByYear(int year);
}
