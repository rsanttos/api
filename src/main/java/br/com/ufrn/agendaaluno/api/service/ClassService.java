package br.com.ufrn.agendaaluno.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.ufrn.agendaaluno.api.dto.ClassDTO;
import br.com.ufrn.agendaaluno.api.request.ClassRequest;

@Service
public class ClassService {

	public ClassDTO[] getStudentClasses(String token, int idStudent) {
		ClassRequest classRequest = new ClassRequest();
		ClassDTO[] studentClasses = classRequest.getStudentClass(token, idStudent);
		return studentClasses;
	}
	
	public List<ClassDTO> getActiveStudentClasses(String token, int idStudent) {
		ClassRequest classRequest = new ClassRequest();
		ClassDTO[] studentClasses = classRequest.getStudentClass(token, idStudent);
		List<ClassDTO> studentClassesAux = new ArrayList<ClassDTO>();
		for(int i = 0 ; i < studentClasses.length ; i++) {
			if(studentClasses[i].getId_situacao_solicitacao() == 2) {
				studentClassesAux.add(studentClasses[i]);
			}
		}
		return studentClassesAux;
	}
}
