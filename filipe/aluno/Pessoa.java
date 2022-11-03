package com.filipe.aluno;

public class Pessoa {

	private int codigo;
	private String nome;
	private String endereço;

	public Pessoa(int codigo, String nome, String endereço) {
		setCodigo(codigo);
		setNome(nome);
		setEndereço(endereço);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", endereço=");
		builder.append(endereço);
		builder.append("]");
		return builder.toString();
	}

}
