package com.filipe.animal;

public class Mamifero extends Animal {

	private int tempo_amamentaçao;
	
	public Mamifero(String nome) {
		super(nome);
	}
	
	public int getTempo_amamentaçao() {
		return tempo_amamentaçao;
	}
	public void setTempo_amamentaçao(int tempo_amamentaçao) {
		this.tempo_amamentaçao = tempo_amamentaçao;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Mamifero [tempo_amamentaçao=");
		builder.append(tempo_amamentaçao);
		builder.append("]");
		return builder.toString();
	}
	
}
