package br.com.ufrn.agendaaluno.api.model.calendar;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public abstract class Calendar {
	@Id
	@GeneratedValue
	@Column(name = "id_calendar")
	private long idCalendar;
	
	private int year;

	@OneToMany(mappedBy = "calendar", targetEntity = Holiday.class, fetch = FetchType.LAZY)
	private List<Holiday> holidays;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

	public long getIdCalendar() {
		return idCalendar;
	}

	public void setIdCalendar(long idCalendar) {
		this.idCalendar = idCalendar;
	}
}
