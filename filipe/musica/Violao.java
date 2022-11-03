package com.filipe.musica;

public class Violao extends Cordas {

	public Violao(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Violao []");
		return builder.toString();
	}

}
