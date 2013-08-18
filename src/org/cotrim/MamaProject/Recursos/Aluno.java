package org.cotrim.MamaProject.Recursos;

public class Aluno {

	private String nome;
	private int idade;
	private String serie;
	private String turma;
	private String turno;
	private String professora;
	
	
	public Aluno(){
		setNome("");
		setIdade(0);
		setSerie("");
		setTurma("");
		setTurno("");
		setProfessora("");
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSerie() {
		return serie;
	}


	public void setSerie(String serie) {
		this.serie = serie;
	}


	public String getTurma() {
		return turma;
	}


	public void setTurma(String turma) {
		this.turma = turma;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getProfessora() {
		return professora;
	}


	public void setProfessora(String professora) {
		this.professora = professora;
	}

	@Override
	public String toString() {
		return "Aluno \n[nome=" + nome + ", \nidade=" + idade + ", \nserie=" + serie
				+ ", \nturma=" + turma + ", \nturno=" + turno + ", \nprofessora="
				+ professora + "]";
	}
	
	
}
