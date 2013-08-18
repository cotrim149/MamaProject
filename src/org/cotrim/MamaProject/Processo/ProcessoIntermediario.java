package org.cotrim.MamaProject.Processo;

import java.util.Vector;

import org.cotrim.MamaProject.Recursos.Aluno;
import org.cotrim.MamaProject.Recursos.Sala;

public class ProcessoIntermediario {

	public ProcessoIntermediario(){
		
	}
	
	public int totalAlunosSala(Sala sala){
		return sala.getAlunos().size();
	}
	
	private int alunosNivel1(Vector<Aluno> alunos){
		int total = 0;
		
		for(int i=0;i< alunos.size();i++){
			Aluno aluno = alunos.get(i);
			
			if(aluno.getNivel() == "1" )
				total++;
		}
		
		return total;
	}

	private int alunosNivel2(Vector<Aluno> alunos){
		int total = 0;
		
		for(int i=0;i< alunos.size();i++){
			Aluno aluno = alunos.get(i);
			
			if(aluno.getNivel() == "2" )
				total++;
		}
		
		return total;
	}
	
	public void rankeamentoSala(Sala sala){
		
		int qtdAlunosNivel1=alunosNivel1(sala.getAlunos());
		int qtdAlunosNivel2=alunosNivel2(sala.getAlunos());
		
		System.out.println("Alunos nivel 1: "+ qtdAlunosNivel1);
		System.out.println("Alunos nivel 2: "+ qtdAlunosNivel2);
		
	}
	
}
