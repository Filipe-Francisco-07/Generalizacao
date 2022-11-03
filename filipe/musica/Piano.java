package com.filipe.musica;

public class Piano extends Cordas {

	public Piano(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Piano []");
		return builder.toString();
	}

	
}
