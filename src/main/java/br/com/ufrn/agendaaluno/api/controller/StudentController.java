package br.com.ufrn.agendaaluno.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;
import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.dto.StudentDTO;
import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import br.com.ufrn.agendaaluno.api.model.user.GraduateStudent;
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.GraduateStudentService;
import br.com.ufrn.agendaaluno.api.service.StudentService;
import br.com.ufrn.agendaaluno.api.service.TaskService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private GraduateStudentService graduateStudentService;
	
	@Autowired
	private ClassService classService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/student/{token}", method = RequestMethod.GET)
	public StudentDTO getStudentLoggedIn(@PathVariable String token) {
		System.out.println("\n---> CLIENTE REQUISITOU DADOS DO USUÁRIO <---");
		System.out.println("---> INFORMAÇÕES DO ALUNO <---");
		System.out.println("---> TAREFAS <---");
		System.out.println("---> AVALIAÇÕES <---");
		GraduateStudent graduateStudent = graduateStudentService.getStudentLoggedIn(token);
		System.out.println(graduateStudent.getCpf_cnpj());
		StudentDTO student = studentService.getStudentLoggedIn(token);
		List<ClassDTO> studentClasses = classService.getActiveStudentClasses(token, student.getId_discente());
		student.setClasses(studentClasses);
		for(ClassDTO classDto : student.getClasses()) {
			TaskDTO[] tasks = taskService.getClassTasks(token, classDto.getId_turma(), classDto.getNome_componente());
			classDto.setTasks(tasks);
		}
		for(ClassDTO classDto : student.getClasses()) {
			EvaluationDTO[] evaluations = evaluationService.getClassEvaluations(token, classDto.getId_turma(), classDto.getNome_componente());
			classDto.setEvaluations(evaluations);
		}
		System.out.println("\n---> INFORMAÇÕES GERADAS E ENVIADAS <---");
		return student;
	}
	
}
