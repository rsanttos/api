package br.com.ufrn.agendaaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.ufrn.agendaaluno.api.model.assistent.ProfessorAssistent;
import br.com.ufrn.agendaaluno.api.model.assistent.Tip;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.user.Professor;
import br.com.ufrn.agendaaluno.api.service.AssistentService;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.ProfessorService;
import br.com.ufrn.agendaaluno.api.service.TaskService;

public class ProfessorAssistentController {
	@Autowired
	private ProfessorService professorService;

	@Autowired
	private ClassService classService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/professor/assistent/{token}", method = RequestMethod.GET)
	public List<Tip> getGraduateTips(@PathVariable String token) {
		
		Professor p = professorService.getProfessorLoggedIn(token);

		System.out.println("---> OBTENDO INFORMAÇÕES DAS TURMAS DO PROFESSOR <---");

		ClassUFRN[] classes = classService.getActiveProfessorClasses(token, p.getId_docente());
		p.setClasses(classes);
		
		classes = taskService.getTasksClasses(token, classes);
		classes = evaluationService.getEvaluationsClasses(token, classes);
		
		return new AssistentService(new ProfessorAssistent(), p.getClasses()).getTips();
	}
}
