package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import br.com.ufrn.agendaaluno.api.model.classes.Task;
import br.com.ufrn.agendaaluno.api.request.TaskRequest;

@Service
public class TaskService {
//
//	public TaskDTO[] getClassTasks(String token, int idClass, String nomeComponente) {
//		TaskRequest taskRequest = new TaskRequest();
//		TaskDTO[] tasks = taskRequest.getClassEvaluations(token, idClass);
//		for(int i = 0 ; i < tasks.length ; i++) {
//			tasks[i].setNomeComponente(nomeComponente);
//		}
//		return tasks;
//	}
	

	public Task[] getClassTasks(String token, int idClass, String nomeComponente) {
		TaskRequest taskRequest = new TaskRequest();
		String tasksStr = taskRequest.getClassTasks(token, idClass);
		Task[] tasks = TaskDTO.toArrayObject(tasksStr);
		if(tasks != null) {
			for(int i = 0 ; i < tasks.length ; i++) {
				tasks[i].setNomeComponente(nomeComponente);
			}
		}
		return tasks;
	}
}
