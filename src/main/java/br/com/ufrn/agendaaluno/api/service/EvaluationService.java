package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.request.EvaluationRequest;
/**
 * Classe de serviço responsável pela intermediação entre os controllers e as
 * requisições
 * 
 * @author ramonsantos
 *
 */
@Service
public class EvaluationService {
	public Evaluation[] getClassEvaluations(String token, int idClass, String nomeComponente) {
		EvaluationRequest evaluationRequest = new EvaluationRequest();
		String evaluationsStr = evaluationRequest.getClassEvaluations(token, idClass);
		Evaluation[] evaluations = EvaluationDTO.toArrayObject(evaluationsStr);
		for(int i = 0 ; i < evaluations.length ; i++) {
			evaluations[i].setNomeComponente(nomeComponente);
		}
		return evaluations;
	}	
}
