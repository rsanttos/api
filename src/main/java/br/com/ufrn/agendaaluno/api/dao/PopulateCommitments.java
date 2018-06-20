package br.com.ufrn.agendaaluno.api.dao;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import br.com.ufrn.agendaaluno.api.model.calendar.Meeting;
import br.com.ufrn.agendaaluno.api.model.calendar.OrientationMeeting;

public class PopulateCommitments {

	public static List<Meeting> populateMeetings(){
		
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
	
	public static List<OrientationMeeting> populateOrientationMeetings(String nomeOrientador){
		List<OrientationMeeting> oms = new ArrayList<OrientationMeeting>();
		OrientationMeeting om1 = new OrientationMeeting(nomeOrientador, "orientando 1", "sala 1", getRandomTimeBetweenTwoDates());
		OrientationMeeting om2 = new OrientationMeeting(nomeOrientador, "orientando 2", "sala 1", getRandomTimeBetweenTwoDates());
		OrientationMeeting om3 = new OrientationMeeting(nomeOrientador, "orientando 3", "sala 1", getRandomTimeBetweenTwoDates());
		OrientationMeeting om4 = new OrientationMeeting(nomeOrientador, "orientando 4", "sala 1", getRandomTimeBetweenTwoDates());
		OrientationMeeting om5 = new OrientationMeeting(nomeOrientador, "orientando 5", "sala 1", getRandomTimeBetweenTwoDates());
		
		oms.add(om1);
		oms.add(om2);
		oms.add(om3);
		oms.add(om4);
		oms.add(om5);
		
		return oms;
	}
	
	private static long getRandomTimeBetweenTwoDates () {
	    long beginTime = Timestamp.valueOf("2018-04-01 00:00:00").getTime();
	    long endTime = Timestamp.valueOf("2018-07-15 00:58:00").getTime();
	    long diff = endTime - beginTime + 1;
	    long result = beginTime + (long) (Math.random() * diff);
	    System.out.println(result);
	    return result;
	}
	
}
