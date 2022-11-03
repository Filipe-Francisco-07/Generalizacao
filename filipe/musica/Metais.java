package com.filipe.musica;

public class Metais extends InstrumentoMusical {

	private double peso;
	
	public Metais(String nome) {
		super(nome);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Metais [peso=");
		builder.append(peso);
		builder.append("]");
		return builder.toString();
	}
	
}
