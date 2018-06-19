package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.request.EvaluationRequest;

@Service
public class EvaluationService {

	public ClassUFRN[] getEvaluationsClasses(String token, ClassUFRN[] studentClasses) {
		System.out.println("---> OBTENDO AVALIAÇÕES DAS TURMAS DISCENTE <---");
		for (int i = 0; i < studentClasses.length; i++) {
			ClassUFRN c = studentClasses[i];
			Evaluation[] evaluations = getClassEvaluations(token, c.getId_turma(),
					c.getNome_componente());
			c.setEvaluations(evaluations);
			studentClasses[i] = c;
		}
		return studentClasses;
	}
	
	public Evaluation[] getClassEvaluations(String token, int idClass, String nomeComponente) {
		EvaluationRequest evaluationRequest = new EvaluationRequest();
		String evaluationsStr = evaluationRequest.getClassEvaluations(token, idClass);
		EvaluationDTO eDto = new EvaluationDTO();
		Evaluation[] evaluations = eDto.toArrayObject(evaluationsStr);
		for(int i = 0 ; i < evaluations.length ; i++) {
			evaluations[i].setNomeComponente(nomeComponente);
		}
		return evaluations;
	}	
}
