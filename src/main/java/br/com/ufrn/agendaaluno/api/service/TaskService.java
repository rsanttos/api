package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import br.com.ufrn.agendaaluno.api.request.TaskRequest;

@Service
public class TaskService {

	public TaskDTO[] getClassTasks(String token, int idClass) {
		TaskRequest taskRequest = new TaskRequest();
		return taskRequest.getClassEvaluations(token, idClass);
	}
}
