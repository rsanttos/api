package br.com.ufrn.agendaaluno.api.model.assistent;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;

public class ProfessorAssistent implements AssistentStrategy {

	@Override
	public List<Tip> generateTips(ClassUFRN classes[]) {
		List<Tip> tips = new ArrayList<>();
		
		Calendar c = Calendar.getInstance();
		long now = c.getTimeInMillis();
		
		
		for (int i = 0; i < classes.length; i++) {
			ClassUFRN classUFRN = classes[i];

			for (Evaluation e : classUFRN.getEvaluations()) {
				if (e.getDate() - now <= 86400000) {
					tips.add(new GraduateStudentTip(e, TipType.EvaluationInOneDay));
				}
			}
		}
		
		return tips;
	}

}
