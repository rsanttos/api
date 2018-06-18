package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Task;
import br.com.ufrn.agendaaluno.api.request.TaskRequest;

@Service
public class TaskService {

	public ClassUFRN[] getTasksClasses(String token, ClassUFRN[] classes) {

		System.out.println("---> OBTENDO TAREFAS DAS TURMAS DISCENTE <---");
		for (int i = 0; i < classes.length; i++) {
			ClassUFRN c = classes[i];
			Task[] tasks = getClassTasks(token, c.getId_turma(), c.getNome_componente());
			c.setTasks(tasks);
			classes[i] = c;
		}

		return classes;
	}

	public Task[] getClassTasks(String token, int idClass, String nomeComponente) {
		TaskRequest taskRequest = new TaskRequest();
		String tasksStr = taskRequest.getClassTasks(token, idClass);
		TaskDTO tDto = new TaskDTO();
		Task[] tasks = tDto.toArrayObject(tasksStr);
		if (tasks != null) {
			for (int i = 0; i < tasks.length; i++) {
				tasks[i].setNomeComponente(nomeComponente);
			}
		}
		return tasks;
	}
}
