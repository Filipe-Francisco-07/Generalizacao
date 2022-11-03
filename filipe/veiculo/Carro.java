package com.filipe.veiculo;

public class Carro extends Veiculo {

	private int portas;

	public Carro(boolean motor) {
		super(motor);
	}

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Carro [portas=");
		builder.append(portas);
		builder.append("]");
		return builder.toString();
	}

}