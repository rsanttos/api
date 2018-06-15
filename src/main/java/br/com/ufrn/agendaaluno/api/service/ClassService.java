package br.com.ufrn.agendaaluno.api.service;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.ClassUFRNDTO;
import br.com.ufrn.agendaaluno.api.model.classes.ClassUFRN;
import br.com.ufrn.agendaaluno.api.request.ClassRequest;

@Service
public class ClassService {

	public ClassUFRN[] getStudentClasses(String token, int idStudent) {
		ClassRequest classRequest = new ClassRequest();
		String studentClassesStr = classRequest.getStudentClass(token, idStudent);
		ClassUFRNDTO cDto = new ClassUFRNDTO();
		return cDto.toArrayObject(studentClassesStr);
	}
	
	public ClassUFRN[] getActiveStudentClasses(String token, int idStudent) {
		ClassRequest classRequest = new ClassRequest();
		String studentClassesStr = classRequest.getStudentClass(token, idStudent);

		ClassUFRNDTO cDto = new ClassUFRNDTO();
		return cDto.toArrayObject(studentClassesStr);
	}
}
