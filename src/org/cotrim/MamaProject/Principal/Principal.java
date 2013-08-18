package org.cotrim.MamaProject.Principal;

import org.cotrim.MamaProject.Processo.ProcessoInicial;
import org.cotrim.MamaProject.Recursos.Aluno;
import org.cotrim.MamaProject.Recursos.Sala;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Sala sala = new Sala();
		ProcessoInicial processo = new ProcessoInicial();
		
		processo.cadastraAluno(aluno);
		processo.cadastraSala(sala);
		processo.adicionaAlunoSala(aluno, sala);
		processo.adicionaAlunoSala(aluno, sala);
		
		System.out.println(aluno.toString());
		System.out.println(sala.toString());
		System.out.println("qtd alunos sala: " + sala.getAlunos().size());
	}

}
