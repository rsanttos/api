package br.com.ufrn.agendaaluno.api.request;

import java.util.List;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;
import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.dto.StudentDTO;
import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import junit.framework.TestCase;

/**
 * Classe de testes para a classe StudentRequest com um token válido
 * 
 * @author ramonsantos
 *
 */
public class TestStudentRequestWithValidToken extends TestCase {
	StudentDTO student;

	/**
	 * Método para inicializar as classes e atributos a serem testados
	 */
	public void setUp() {
		String validToken = "7a8f5468-d17f-4f80-a28d-a19d531d5128";
		StudentRequest sr = new StudentRequest();
		ClassRequest cr = new ClassRequest();
		EvaluationRequest er = new EvaluationRequest();
		TaskRequest tr = new TaskRequest();
		student = sr.getStudentLoggedIn(validToken);
		String classesStr = cr.getStudentClass(validToken, student.getId_discente());
		ClassDTO[] teste = ClassDTO.toArrayObject(classesStr);
		List<ClassDTO> classesList = ClassDTO.staticToDynamic(teste);
		student.setClasses(classesList);
		for (ClassDTO c : student.getClasses()) {
			String evaluationsStr = er.getClassEvaluations(validToken, c.getId_turma());
			String tasksStr = tr.getClassTasks(validToken, c.getId_turma());
			c.setEvaluations(EvaluationDTO.toArrayObject(evaluationsStr));
			c.setTasks(TaskDTO.toArrayObject(tasksStr));
		}
	}

	public void tearDown() {

	}

	/**
	 * Teste do método que traz as informações do aluno logado com token válido
	 */
	@Test
	public void testValidTokenStudentLoggedIn() {
		assertNotNull(student);
	}

	/*
	 * Método que traz as turmas de um aluno com token válido
	 */
	@Test
	public void testValidTokenClassStudent() {

		assertNotNull(student.getClasses());
	}

	/**
	 * Método que traz as avaliações de cada turma do aluno com token válido
	 */
	@Test
	public void testValidTokenEvaluationsClassStudent() {
		for (ClassDTO c : student.getClasses()) {
			assertNotNull(c.getEvaluations());
		}
	}

	/**
	 * Método que traz as tarefas de cada turma do aluno com token válido
	 */
	@Test
	public void testValidTokenTasksClassStudent() {
		for (ClassDTO c : student.getClasses()) {
			assertNotNull(c.getTasks());
		}
	}

}
