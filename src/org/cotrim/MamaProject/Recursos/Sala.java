package org.cotrim.MamaProject.Recursos;

import java.util.Vector;

public class Sala {

	private String nome;
	private Vector<Aluno> alunos;
	
	public Sala(){
		setNome("");
		setAlunos(new Vector<Aluno>());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;	}

	public Vector<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Vector<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	public void addAlunoSala(Aluno aluno){
		this.alunos.add(aluno);
	}

	@Override
	public String toString() {
		return "\nSala \n[nome=" + nome + ", \nalunos=" + alunos + "]";
	}
	
}
