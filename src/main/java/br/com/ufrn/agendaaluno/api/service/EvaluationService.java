package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.request.EvaluationRequest;

@Service
public class EvaluationService {
	public EvaluationDTO[] getClassEvaluations(String token, int idClass) {
		EvaluationRequest evaluationRequest = new EvaluationRequest();
		return evaluationRequest.getClassEvaluations(token, idClass);
	}
	
}
