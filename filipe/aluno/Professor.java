package com.filipe.aluno;

public class Professor extends Pessoa {
	
	private String disciplina;

	public Professor(int codigo, String nome, String endereço) {
		super(codigo,nome,endereço);
		setDisciplina(disciplina);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Professor [disciplina=");
		builder.append(disciplina);
		builder.append("]");
		return builder.toString();
	}

}