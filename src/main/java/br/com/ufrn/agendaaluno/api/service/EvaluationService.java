package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.request.EvaluationRequest;

@Service
public class EvaluationService {
	public EvaluationDTO[] getClassEvaluations(String token, int idClass, String nomeComponente) {
		EvaluationRequest evaluationRequest = new EvaluationRequest();
		EvaluationDTO[] evaluations = evaluationRequest.getClassEvaluations(token, idClass);
		for(int i = 0 ; i < evaluations.length ; i++) {
			evaluations[i].setNomeComponente(nomeComponente);
		}
		return evaluations;
	}
	
}
