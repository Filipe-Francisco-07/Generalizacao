package com.filipe.musica;

public class Tuba extends Metais {

	public Tuba(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tuba []");
		return builder.toString();
	}

}
