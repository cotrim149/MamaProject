package org.cotrim.MamaProject.Principal;

import org.cotrim.MamaProject.Recursos.Aluno;

public class Cadastro {

	public Cadastro(){
		
	}
	
	public Aluno cadastraAluno(Aluno aluno){
		
		aluno.setNome("Nome aluno");
		aluno.setIdade(10);
		aluno.setSerie("Serie Aluno");
		aluno.setTurma("Turma aluno");
		aluno.setTurno("Turno aluno");
		aluno.setProfessora("Nome professora");
		return aluno;
	}
	
}
