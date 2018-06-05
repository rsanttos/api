package br.com.ufrn.agendaaluno.api.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.ufrn.agendaaluno.api.model.calendar.GraduateCalendar;

public interface GraduateCalendarRepository extends CrudRepository<GraduateCalendar, Long> {
	public GraduateCalendar findByYear(int year);
}
