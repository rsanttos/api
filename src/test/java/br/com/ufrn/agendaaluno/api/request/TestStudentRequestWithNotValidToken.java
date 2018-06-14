package br.com.ufrn.agendaaluno.api.request;

import java.util.List;

import org.junit.Test;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;
import br.com.ufrn.agendaaluno.api.dto.EvaluationDTO;
import br.com.ufrn.agendaaluno.api.dto.StudentDTO;
import br.com.ufrn.agendaaluno.api.dto.TaskDTO;
import junit.framework.TestCase;

/**
 * Classe de testes para a classe StudentRequest com um token inválido
 * 
 * @author ramonsantos
 *
 */
public class TestStudentRequestWithNotValidToken extends TestCase {
	StudentDTO student;


	/**
	 * Método para inicializar as classes e atributos a serem testados
	 */
	public void setUp() {
		String notValidToken = "7a8f5468-d17f-4f80-a28d-a19d531d5128";
		StudentRequest sr = new StudentRequest();
		ClassRequest cr = new ClassRequest();
		EvaluationRequest er = new EvaluationRequest();
		TaskRequest tr = new TaskRequest();
		student = sr.getStudentLoggedIn(notValidToken);
		String classesStr = cr.getStudentClass(notValidToken, student.getId_discente());
		ClassDTO[] teste = ClassDTO.toArrayObject(classesStr);
		List<ClassDTO> classesList = ClassDTO.staticToDynamic(teste);
		student.setClasses(classesList);
		for (ClassDTO c : student.getClasses()) {
			String evaluationsStr = er.getClassEvaluations(notValidToken, c.getId_turma());
			String tasksStr = tr.getClassTasks(notValidToken, c.getId_turma());
			c.setEvaluations(EvaluationDTO.toArrayObject(evaluationsStr));
			c.setTasks(TaskDTO.toArrayObject(tasksStr));
		}
	}

	public void tearDown() {

	}

	/**
	 * Teste do método que traz as informações do aluno logado com token inválido
	 */
	@Test
	public void testNotValidTokenStudentLoggedIn() {
		assertNull(student);
	}

	/*
	 * Método que traz as turmas de um aluno com token inválido
	 */
	@Test
	public void testNotValidTokenClassStudent() {
		assertNull(student.getClasses());
	}

	/**
	 * Método que traz as avaliações de cada turma do aluno com token inválido
	 */
	@Test
	public void testNotValidTokenEvaluationsClassStudent() {
		for (ClassDTO c : student.getClasses()) {
			assertNull(c.getEvaluations());
		}
	}

	/**
	 * Método que traz as avaliações de cada turma do aluno com token inválido
	 */
	@Test
	public void testNotValidTokenTasksClassStudent() {
		for (ClassDTO c : student.getClasses()) {
			assertNull(c.getTasks());
		}
	}
}
