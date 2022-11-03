package com.filipe.aluno;

public class Aluno extends Pessoa {


		private int matricula;

		public Aluno(int codigo, String nome, String endereço) {
			super(codigo,nome,endereço);
			setMatricula(matricula);
		}

		public int getMatricula() {
			return matricula;
		}

		public void setMatricula(int matricula) {
			this.matricula = matricula;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(super.toString());
			builder.append("Aluno [matricula=");
			builder.append(matricula);
			builder.append("]");
			return builder.toString();
	
	}
}
