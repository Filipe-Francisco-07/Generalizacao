package com.filipe.musica;

public class InstrumentoMusical {

	private String nome;
	
	public InstrumentoMusical(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("InstrumentoMusical [nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
}
