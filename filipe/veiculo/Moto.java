package com.filipe.veiculo;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(boolean motor) {
		super(motor);
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Moto [cilindradas=");
		builder.append(cilindradas);
		builder.append("]");
		return builder.toString();
	}

}