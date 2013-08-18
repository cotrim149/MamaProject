package org.cotrim.MamaProject.Principal;

import org.cotrim.MamaProject.Processo.Processo;
import org.cotrim.MamaProject.Recursos.Aluno;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Processo processo = new Processo();
		
		processo.cadastraAluno(aluno);
		
		System.out.println(aluno.toString());
		
	}

}
