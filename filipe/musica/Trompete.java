package com.filipe.musica;

public class Trompete extends Metais {

	public Trompete(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Trompete []");
		return builder.toString();
	}

}
