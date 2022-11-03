package com.filipe.animal;

public class Reptil extends Animal {

	private int peso_ovo;
	
	public Reptil(String nome) {
		super(nome);
	}

	public int getPeso_ovo() {
		return peso_ovo;
	}

	public void setPeso_ovo(int peso_ovo) {
		this.peso_ovo = peso_ovo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Reptil [peso_ovo=");
		builder.append(peso_ovo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
