package com.filipe.musica;

public class Prato extends Percussao {

	public Prato(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Prato []");
		return builder.toString();
	}

}
