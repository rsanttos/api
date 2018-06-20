package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.model.classes.Task;

public class UndergraduateStudentAssistent implements AssistentStrategy {
	@Override
	public List<Tip> generateTips(ClassUFRN classes[]) {
		List<Tip> tips = new ArrayList<>();
		
		Calendar c = Calendar.getInstance();
		long now = c.getTimeInMillis();

		for (int i = 0; i < classes.length; i++) {
			ClassUFRN classUFRN = classes[i];

			for (Evaluation e : classUFRN.getEvaluations()) {
				if (e.getDate() - now <= 432000000) {
					tips.add(new GraduateStudentTip(e, TipType.EvaluationInFiveDays));
				}
			}
			
			for (Task t : classUFRN.getTasks()) {				
				if(t.getData_entrega() - now <= 432000000) {
					tips.add(new GraduateStudentTip(t, TipType.TaskEndInFiveDays));
				}
			}
		}
		
		return tips;
	}

}
