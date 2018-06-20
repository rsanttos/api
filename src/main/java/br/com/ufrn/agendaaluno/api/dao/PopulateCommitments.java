package br.com.ufrn.agendaaluno.api.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.DayWithoutWork;
import br.com.ufrn.agendaaluno.api.model.calendar.Meeting;
import br.com.ufrn.agendaaluno.api.model.calendar.OrientationMeeting;
import br.com.ufrn.agendaaluno.api.model.calendar.StudyGroup;

public class PopulateCommitments {

	public static List<Meeting> populateMeetings() {

		List<Meeting> meetings = new ArrayList<Meeting>();
		Meeting m1 = new Meeting("assunto 1", "pauta 1", "sala 1", getRandomTimeBetweenTwoDates());
		Meeting m2 = new Meeting("assunto 2", "pauta 2", "sala 2", getRandomTimeBetweenTwoDates());
		Meeting m3 = new Meeting("assunto 3", "pauta 3", "sala 3", getRandomTimeBetweenTwoDates());
		Meeting m4 = new Meeting("assunto 4", "pauta 4", "sala 4", getRandomTimeBetweenTwoDates());
		Meeting m5 = new Meeting("assunto 5", "pauta 5", "sala 5", getRandomTimeBetweenTwoDates());
		Meeting m6 = new Meeting("assunto 6", "pauta 6", "sala 6", getRandomTimeBetweenTwoDates());
		Meeting m7 = new Meeting("assunto 7", "pauta 7", "sala 7", getRandomTimeBetweenTwoDates());
		Meeting m8 = new Meeting("assunto 8", "pauta 8", "sala 8", getRandomTimeBetweenTwoDates());
		meetings.add(m1);
		meetings.add(m2);
		meetings.add(m3);
		meetings.add(m4);
		meetings.add(m5);
		meetings.add(m6);
		meetings.add(m7);
		meetings.add(m8);

		return meetings;
	}

	public static List<OrientationMeeting> populateOrientationMeetings(String nomeOrientador) {
		List<OrientationMeeting> oms = new ArrayList<OrientationMeeting>();
		OrientationMeeting om1 = new OrientationMeeting(nomeOrientador, "orientando 1", "sala 1",
				getRandomTimeBetweenTwoDates());
		OrientationMeeting om2 = new OrientationMeeting(nomeOrientador, "orientando 2", "sala 1",
				getRandomTimeBetweenTwoDates());
		OrientationMeeting om3 = new OrientationMeeting(nomeOrientador, "orientando 3", "sala 1",
				getRandomTimeBetweenTwoDates());
		OrientationMeeting om4 = new OrientationMeeting(nomeOrientador, "orientando 4", "sala 1",
				getRandomTimeBetweenTwoDates());
		OrientationMeeting om5 = new OrientationMeeting(nomeOrientador, "orientando 5", "sala 1",
				getRandomTimeBetweenTwoDates());

		oms.add(om1);
		oms.add(om2);
		oms.add(om3);
		oms.add(om4);
		oms.add(om5);

		return oms;
	}

	public static List<DayWithoutWork> populateDaysWithoutWork() {
		List<DayWithoutWork> dwws = new ArrayList<DayWithoutWork>();
		long time = Timestamp.valueOf("2018-06-22 09:00:00").getTime();
		DayWithoutWork dww = new DayWithoutWork("JOGO DO BRASIL - COPA 2018", time);
		dwws.add(dww);
		return dwws;
	}


	public static List<StudyGroup> populateStudiesGroup() {
		List<StudyGroup> sgs = new ArrayList<StudyGroup>();
		StudyGroup sg1 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		StudyGroup sg2 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		StudyGroup sg3 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		StudyGroup sg4 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		StudyGroup sg5 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		StudyGroup sg6 = new StudyGroup("Sala 1", "Disciplina A", getRandomTimeBetweenTwoDates());
		
		sgs.add(sg1);
		sgs.add(sg2);
		sgs.add(sg3);
		sgs.add(sg4);
		sgs.add(sg5);
		sgs.add(sg6);
		
		return sgs;
	}
	private static long getRandomTimeBetweenTwoDates() {
		long beginTime = Timestamp.valueOf("2018-04-01 00:00:00").getTime();
		long endTime = Timestamp.valueOf("2018-07-15 00:58:00").getTime();
		long diff = endTime - beginTime + 1;
		long result = beginTime + (long) (Math.random() * diff);
		System.out.println(result);
		return result;
	}

}
