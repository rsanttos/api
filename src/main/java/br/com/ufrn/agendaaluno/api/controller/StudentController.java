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
import br.com.ufrn.agendaaluno.api.model.user.UndergraduateStudent;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.GraduateStudentService;
import br.com.ufrn.agendaaluno.api.service.StudentService;
import br.com.ufrn.agendaaluno.api.service.TaskService;
import br.com.ufrn.agendaaluno.api.service.UndergraduateStudentService;

@RestController
public class StudentController {

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

	@RequestMapping(value = "/student/undergraduate/{token}", method = RequestMethod.GET)
	public UndergraduateStudent getUndergraduateStudentLoggedIn(@PathVariable String token) {
		System.out.println("*************************************************************************************");
		System.out.println("\n---> AGENDA DO ALUNO DE GRADUAÇÃO REQUISITOU DADOS ALUNO <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO USUÁRIO LOGADO NO SIGAA <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO DISCENTE <---");
		UndergraduateStudent undergraduateStudent = (UndergraduateStudent) undergraduateStudentService
				.getStudentLoggedIn(token);
		System.out.println("---> OBTENDO TURMAS DO DISCENTE <---");
		ClassUFRN[] studentClasses = classService.getActiveStudentClasses(token, undergraduateStudent.getId_discente());
		undergraduateStudent.setClasses(studentClasses);
		System.out.println("---> OBTENDO TAREFAS DO DISCENTE <---");
		for (int i = 0; i < undergraduateStudent.getClasses().length; i++) {
			ClassUFRN c = undergraduateStudent.getClasses()[i];
			Task[] tasks = taskService.getClassTasks(token, c.getId_turma(), c.getNome_componente());
			c.setTasks(tasks);
			undergraduateStudent.getClasses()[i] = c;
		}
		System.out.println("---> OBTENDO AVALIAÇÕES DO DISCENTE <---");
		for (int i = 0; i < undergraduateStudent.getClasses().length; i++) {
			ClassUFRN c = undergraduateStudent.getClasses()[i];
			Evaluation[] evaluations = evaluationService.getClassEvaluations(token, c.getId_turma(),
					c.getNome_componente());
			c.setEvaluations(evaluations);
			undergraduateStudent.getClasses()[i] = c;
		}

		System.out.println("---> AS SEGUINTES INFORMAÇÕES DO DISCENTE LOGADO FORAM CARREGADAS <---");
		System.out.println("- DADOS DO USUÁRIO NO SIGAA");
		System.out.println("- DADOS DO DISCENTE NO SIGAA");
		System.out.println("- DADOS DAS TURMAS DO DISCENTE NO SIGAA");
		System.out.println("- DADOS DAS TAREFAS DO DISCENTE NO SIGAA");
		System.out.println("- DADOS DAS AVALIAÇÕES DO DISCENTE NO SIGAA");
		System.out.println("---> INFORMAÇÕES CARREGADAS E DISPONIBILIZADAS PARA O CLIENTE <---");
		System.out.println("*************************************************************************************");

		return undergraduateStudent;
	}

	@RequestMapping(value = "/student/graduate/{token}", method = RequestMethod.GET)
	public GraduateStudent getGraduateStudentLoggedIn(@PathVariable String token) {
		System.out.println("*************************************************************************************");
		System.out.println("\n---> AGENDA DO ALUNO DE PÓS GRADUAÇÃO REQUISITOU DADOS ALUNO <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO USUÁRIO LOGADO NO SIGAA <---");
		System.out.println("---> OBTENDO INFORMAÇÕES DO DISCENTE DE PÓS <---");
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

		System.out.println("---> AS SEGUINTES INFORMAÇÕES DO DISCENTE DE PÓS LOGADO FORAM CARREGADAS <---");
		System.out.println("- DADOS DO USUÁRIO NO SIGAA");
		System.out.println("- DADOS DO DISCENTE DE PÓS NO SIGAA");
		System.out.println("- DADOS DAS TURMAS DO DISCENTE DE PÓS NO SIGAA");
		System.out.println("- DADOS DAS TAREFAS DO DISCENTE DE PÓS NO SIGAA");
		System.out.println("- DADOS DAS AVALIAÇÕES DO DISCENTE DE PÓS NO SIGAA");
		System.out.println("---> INFORMAÇÕES CARREGADAS E DISPONIBILIZADAS PARA O CLIENTE <---");
		System.out.println("*************************************************************************************");

		return graduateStudent;
	}
}
