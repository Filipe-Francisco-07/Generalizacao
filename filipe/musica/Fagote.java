package com.filipe.musica;

public class Fagote extends Madeiras {

	public Fagote(String nome) {
		super(nome);	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Fagote []");
		return builder.toString();
	}
	
}
