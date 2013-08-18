package org.cotrim.MamaProject.Processo;

import org.cotrim.MamaProject.Recursos.Aluno;
import org.cotrim.MamaProject.Recursos.Sala;

public class ProcessoInicial {

	public ProcessoInicial(){
		
	}
	
	public Aluno cadastraAluno(Aluno aluno){
		
		aluno.setNome("Nome aluno");
		aluno.setIdade(10);
		aluno.setSerie("Serie Aluno");
		aluno.setTurma("Turma aluno");
		aluno.setTurno("Turno aluno");
		aluno.setProfessora("Nome professora");
		aluno.setNivel("Nivel aluno");
		return aluno;
	}
	
	public Sala cadastraSala(Sala sala){
		sala.setNome("sala 1");
		return sala;
	}
	
	public void adicionaAlunoSala(Aluno aluno,Sala sala){
		sala.addAlunoSala(aluno);
	}
}
