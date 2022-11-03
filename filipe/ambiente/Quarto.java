package com.filipe.ambiente;

public class Quarto extends Ambiente {

	private int capacidade;

	public Quarto(float area) {
		super(area);
		setCapacidade(capacidade);
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Quarto [capacidade=");
		builder.append(capacidade);
		builder.append("]");
		return builder.toString();
	}

}