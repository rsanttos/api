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
import br.com.ufrn.agendaaluno.api.service.ClassService;
import br.com.ufrn.agendaaluno.api.service.EvaluationService;
import br.com.ufrn.agendaaluno.api.service.StudentService;
import br.com.ufrn.agendaaluno.api.service.TaskService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ClassService classService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private EvaluationService evaluationService;

	@RequestMapping(value = "/student/{token}", method = RequestMethod.GET)
	public StudentDTO getStudentLoggedIn(@PathVariable String token) {
		StudentDTO student = studentService.getStudentLoggedIn(token);
		List<ClassDTO> studentClasses = classService.getActiveStudentClasses(token, student.getId_discente());
		student.setClasses(studentClasses);
		for(ClassDTO classDto : student.getClasses()) {
			TaskDTO[] tasks = taskService.getClassTasks(token, classDto.getId_turma());
			classDto.setTasks(tasks);
		}
		for(ClassDTO classDto : student.getClasses()) {
			EvaluationDTO[] evaluations = evaluationService.getClassEvaluations(token, classDto.getId_turma());
			classDto.setEvaluations(evaluations);
		}
		return student;
	}
	
}