package com.filipe.pessoa;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private String estado_civil;
	
	public PessoaFisica(String nome, String endereço) {
		super(nome,endereço);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("PessoaFisica [cpf=");
		builder.append(cpf);
		builder.append(", estado_civil=");
		builder.append(estado_civil);
		builder.append("]");
		return builder.toString();
	}
	
}
