package com.filipe.aluno;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor prof = new Professor(3,"marcos","Rio do sul");
		prof.setDisciplina("Matemática");
		System.out.println(prof);

		Aluno al = new Aluno(2,"gabriel","rio do sul");
		al.setMatricula(123123);
		System.out.println(al);

	}

}