package br.com.ufrn.agendaaluno.api.model.calendar;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Calendar {
	@Id
	@GeneratedValue
	@Column(name = "id_calendar")
	private long idCalendar;
	
	private int year;
	private long startOnlineEnrollment;
	private long startExtraordinaryEnrollment;
	private long startPeriod;
	private long startReEnrollment;
	private long endExtraordinaryEnrollment;
	private long endOnlineEnrollment;
	private long endPeriod;
	private long endReEnrollment;
	
	@OneToMany(mappedBy = "calendar", targetEntity = Holiday.class, fetch = FetchType.LAZY)
	private List<Holiday> holidays;
	
	public Calendar() {
		super();
	}


	public long getIdCalendar() {
		return idCalendar;
	}


	public void setIdCalendar(long idCalendar) {
		this.idCalendar = idCalendar;
	}
	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public long getStartOnlineEnrollment() {
		return startOnlineEnrollment;
	}


	public void setStartOnlineEnrollment(long startOnlineEnrollment) {
		this.startOnlineEnrollment = startOnlineEnrollment;
	}


	public long getStartExtraordinaryEnrollment() {
		return startExtraordinaryEnrollment;
	}


	public void setStartExtraordinaryEnrollment(long startExtraordinaryEnrollment) {
		this.startExtraordinaryEnrollment = startExtraordinaryEnrollment;
	}


	public long getStartPeriod() {
		return startPeriod;
	}


	public void setStartPeriod(long startPeriod) {
		this.startPeriod = startPeriod;
	}


	public long getStartReEnrollment() {
		return startReEnrollment;
	}


	public void setStartReEnrollment(long startReEnrollment) {
		this.startReEnrollment = startReEnrollment;
	}


	public long getEndExtraordinaryEnrollment() {
		return endExtraordinaryEnrollment;
	}


	public void setEndExtraordinaryEnrollment(long endExtraordinaryEnrollment) {
		this.endExtraordinaryEnrollment = endExtraordinaryEnrollment;
	}


	public long getEndOnlineEnrollment() {
		return endOnlineEnrollment;
	}


	public void setEndOnlineEnrollment(long endOnlineEnrollment) {
		this.endOnlineEnrollment = endOnlineEnrollment;
	}


	public long getEndPeriod() {
		return endPeriod;
	}


	public void setEndPeriod(long endPeriod) {
		this.endPeriod = endPeriod;
	}


	public long getEndReEnrollment() {
		return endReEnrollment;
	}


	public void setEndReEnrollment(long endReEnrollment) {
		this.endReEnrollment = endReEnrollment;
	}


	public List<Holiday> getHolidays() {
		return holidays;
	}

	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}

}
