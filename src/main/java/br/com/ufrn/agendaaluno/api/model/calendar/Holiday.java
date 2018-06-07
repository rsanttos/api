package br.com.ufrn.agendaaluno.api.model.calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Holiday extends Commitment {
	@Id
	@GeneratedValue
	@Column(name = "id_holiday")
	private long idHoliday;

	private long date;
	private String description;

	@ManyToOne
	@JoinColumn(name = "id_calendar")
	private GraduateCalendar calendar;

	public Holiday() {
		super();
	}

	public Holiday(long date, String description) {
		super();
		this.date = date;
		this.description = description;
	}

	public Holiday(long date, String description, GraduateCalendar calendar) {
		super();
		this.date = date;
		this.description = description;
		this.calendar = calendar;
	}

	public long getIdHoliday() {
		return idHoliday;
	}

	public void setIdHoliday(long idHoliday) {
		this.idHoliday = idHoliday;
	}

	public long getDate() {
		return date;
	}

	public void setDate(long date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GraduateCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(GraduateCalendar calendar) {
		this.calendar = calendar;
	}

}
