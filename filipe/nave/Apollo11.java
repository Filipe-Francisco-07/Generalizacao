package com.filipe.nave;

public class Apollo11 extends NaveEspacial {

	private String tipoCombustivel;

	public Apollo11(double velocidadeMaxima) {
		super(velocidadeMaxima);
		setTipoCombustivel(tipoCombustivel);
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Apollo11 [tipoCombustivel=");
		builder.append(tipoCombustivel);
		builder.append("]");
		return builder.toString();
	}

}