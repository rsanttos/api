package br.com.ufrn.agendaaluno.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.model.user.Professor;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.ProfessorService;
import br.com.ufrn.agendaaluno.api.service.TaskService;

@RestController
public class ProfessorController {

	@Autowired
	private ProfessorService professorService;

	@Autowired
	private ClassService classService;

	@Autowired
	private TaskService taskService;

	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/professor/{token}", method = RequestMethod.GET)
	public Professor getProfessorLoggedIn(@PathVariable String token) {
		System.out.println("*************************************************************************************");
		System.out.println("\n---> AGENDA DO PROFESSOR REQUISITOU DADOS DO PROFESSOR <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO USUÁRIO LOGADO NO SIGAA <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO PROFESSOR <---");

		Professor p = professorService.getProfessorLoggedIn(token);

		System.out.println("---> OBTENDO INFORMAÇÕES DAS TURMAS DO PROFESSOR <---");

		ClassUFRN[] classes = classService.getActiveProfessorClasses(token, p.getId_docente());
		p.setClasses(classes);
		
		classes = taskService.getTasksClasses(token, classes);
		classes = evaluationService.getEvaluationsClasses(token, classes);
		
		System.out.println("---> AS SEGUINTES INFORMAÇÕES DO DISCENTE LOGADO FORAM CARREGADAS <---");
		System.out.println("- DADOS DO USUÁRIO NO SIGAA");
		System.out.println("- DADOS DO DOCENTE NO SIGAA");
		System.out.println("- DADOS DAS TURMAS DO DOCENTE NO SIGAA");
		System.out.println("- DADOS DAS TAREFAS CADASTRADAS NAS TURMAS DO DOCENTE NO SIGAA");
		System.out.println("- DADOS DAS AVALIAÇÕES CADASTRADAS NAS TURMAS DO DOCENTE NO SIGAA");
		System.out.println("---> INFORMAÇÕES CARREGADAS E DISPONIBILIZADAS PARA O CLIENTE <---");
		System.out.println("*************************************************************************************");

		return p;
	}
}
