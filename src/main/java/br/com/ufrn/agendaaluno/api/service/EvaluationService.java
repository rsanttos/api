package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.request.EvaluationRequest;

@Service
public class EvaluationService {
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
