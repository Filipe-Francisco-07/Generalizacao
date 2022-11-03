package com.filipe.ambiente;

public class Cozinha extends Ambiente {


	private boolean microondas;

	public Cozinha(float area) {
		super(area);
		setMicroondas(microondas);
	}

	public boolean isMicroondas() {
		return microondas;
	}

	public void setMicroondas(boolean microondas) {
		this.microondas = microondas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Cozinha [microondas=");
		builder.append(microondas);
		builder.append("]");
		return builder.toString();
	}

}
