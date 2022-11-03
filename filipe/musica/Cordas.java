package com.filipe.musica;

public class Cordas extends InstrumentoMusical {

	private int n_cordas;
	
	public Cordas(String nome) {
		super(nome);
	}

	public int getN_cordas() {
		return n_cordas;
	}

	public void setN_cordas(int n_cordas) {
		this.n_cordas = n_cordas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cordas [n_cordas=");
		builder.append(n_cordas);
		builder.append("]");
		return builder.toString();
	}
	
}
