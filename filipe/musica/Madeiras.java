package com.filipe.musica;

public class Madeiras extends InstrumentoMusical {

	private double tam;
	
	public Madeiras(String nome) {
		super(nome);
	}

	public double getTam() {
		return tam;
	}

	public void setTam(double tam) {
		this.tam = tam;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Madeiras [tam=");
		builder.append(tam);
		builder.append("]");
		return builder.toString();
	}
	
}
