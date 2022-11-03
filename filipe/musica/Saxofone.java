package com.filipe.musica;

public class Saxofone extends Madeiras {

	public Saxofone(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Saxofone []");
		return builder.toString();
	}

}
