package br.com.ufrn.agendaaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ufrn.agendaaluno.api.model.assistent.GraduateStudentAssistent;
import br.com.ufrn.agendaaluno.api.model.assistent.Tip;
import br.com.ufrn.agendaaluno.api.model.assistent.UndergraduateStudentAssistent;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.classes.Evaluation;
import br.com.ufrn.agendaaluno.api.model.classes.Task;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;
import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;
import br.com.ufrn.agendaaluno.api.service.AssistentService;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.GraduateStudentService;
import br.com.ufrn.agendaaluno.api.service.TaskService;
import br.com.ufrn.agendaaluno.api.service.UndergraduateStudentService;

public class StudentAssistentController {
	@Autowired
	private GraduateStudentService graduateStudentService;

	@Autowired
	private UndergraduateStudentService undergraduateStudentService;

	@Autowired
	private ClassService classService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/student/graduate/assistent/{token}", method = RequestMethod.GET)
	public List<Tip> getGraduateTips(@PathVariable String token) {
		
		GraduateStudent graduateStudent = (GraduateStudent) graduateStudentService.getStudentLoggedIn(token);
		System.out.println("---> OBTENDO TURMAS DO DISCENTE DE PÓS <---");
		
		ClassUFRN[] studentClasses = classService.getActiveStudentClasses(token, graduateStudent.getId_discente());
		graduateStudent.setClasses(studentClasses);
		
		System.out.println("---> OBTENDO TAREFAS DO DISCENTE DE PÓS <---");
		for (int i = 0; i < graduateStudent.getClasses().length; i++) {
			ClassUFRN c = graduateStudent.getClasses()[i];
			Task[] tasks = taskService.getClassTasks(token, c.getId_turma(), c.getNome_componente());
			c.setTasks(tasks);
			graduateStudent.getClasses()[i] = c;
		}
		
		System.out.println("---> OBTENDO AVALIAÇÕES DO DISCENTE DE PÓS <---");
		for (int i = 0; i < graduateStudent.getClasses().length; i++) {
			ClassUFRN c = graduateStudent.getClasses()[i];
			Evaluation[] evaluations = evaluationService.getClassEvaluations(token, c.getId_turma(),
					c.getNome_componente());
			c.setEvaluations(evaluations);
			graduateStudent.getClasses()[i] = c;
		}
		
		return new AssistentService(new GraduateStudentAssistent(), graduateStudent.getClasses()).getTips();
	}
	
	@RequestMapping(value = "/student/undergraduate/assistent/{token}", method = RequestMethod.GET)
	public List<Tip> getUndergraduateTips(@PathVariable String token) {
		
		GraduateStudent graduateStudent = (GraduateStudent) graduateStudentService.getStudentLoggedIn(token);
		System.out.println("---> OBTENDO INFORMAÇÕES DO DISCENTE <---");
		UndergraduateStudent undergraduateStudent = (UndergraduateStudent) undergraduateStudentService
				.getStudentLoggedIn(token);
		System.out.println("---> OBTENDO TURMAS DO DISCENTE <---");
		ClassUFRN[] studentClasses = classService.getActiveStudentClasses(token, undergraduateStudent.getId_discente());
		undergraduateStudent.setClasses(studentClasses);

		studentClasses = taskService.getTasksClasses(token, studentClasses);
		studentClasses = evaluationService.getEvaluationsClasses(token, studentClasses);
		
		return new AssistentService(new UndergraduateStudentAssistent(), graduateStudent.getClasses()).getTips();
	}	
}
