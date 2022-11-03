package com.filipe.musica;

public class Tambor extends Percussao {

	public Tambor(String nome) {
		super(nome);
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Tambor []");
		return builder.toString();
	}

}
