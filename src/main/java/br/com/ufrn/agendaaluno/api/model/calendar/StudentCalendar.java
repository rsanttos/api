package br.com.ufrn.agendaaluno.api.model.calendar;

public abstract class StudentCalendar extends Calendar {
	
	private long startOnlineEnrollment;
	private long startExtraordinaryEnrollment;
	private long startPeriod;
	private long startReEnrollment;
	private long endExtraordinaryEnrollment;
	private long endOnlineEnrollment;
	private long endPeriod;
	private long endReEnrollment;

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
}
