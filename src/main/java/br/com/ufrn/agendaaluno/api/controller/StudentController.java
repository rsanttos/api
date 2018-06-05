package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.model.classes.Task;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.GraduateStudentService;
import br.com.ufrn.agendaaluno.api.service.TaskService;

@RestController
public class StudentController {
		
	@Autowired
	private GraduateStudentService graduateStudentService;
	
	@Autowired
	private ClassService classService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/student/graduate/{token}", method = RequestMethod.GET)
	public GraduateStudent getGraduateStudentLoggedIn(@PathVariable String token) {
		System.out.println("\n---> CLIENTE REQUISITOU DADOS DO USUÁRIO <---");
		System.out.println("---> INFORMAÇÕES DO ALUNO <---");
		System.out.println("---> TAREFAS <---");
		System.out.println("---> AVALIAÇÕES <---");
		GraduateStudent graduateStudent = graduateStudentService.getStudentLoggedIn(token);
		ClassUFRN[] studentClasses = classService.getActiveStudentClasses(token, graduateStudent.getId_discente());
		
		graduateStudent.setClasses(studentClasses);
		
		for(int i = 0 ; i < graduateStudent.getClasses().length ; i++) {
			ClassUFRN c = graduateStudent.getClasses()[i];
			Task[] tasks = taskService.getClassTasks(token, c.getId_turma(), c.getNome_componente());
			c.setTasks(tasks);	
			graduateStudent.getClasses()[i] = c;
		}		

		for(int i = 0 ; i < graduateStudent.getClasses().length ; i++) {
			ClassUFRN c = graduateStudent.getClasses()[i];
			Evaluation[] evaluations = evaluationService.getClassEvaluations(token, c.getId_turma(),
					c.getNome_componente());
			c.setEvaluations(evaluations);
			graduateStudent.getClasses()[i] = c;
		}
		
		return graduateStudent;
	}	
}
