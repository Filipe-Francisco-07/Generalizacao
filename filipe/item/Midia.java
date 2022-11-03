package com.filipe.item;

public class Midia extends Item {

	private String gravadora;
	private double duraçao;
	
	public Midia(int codigo, String descriçao) {
		super(codigo,descriçao);
	}

	public String getGravadora() {
		return gravadora;
	}

	public void setGravadora(String gravadora) {
		this.gravadora = gravadora;
	}

	public double getDuraçao() {
		return duraçao;
	}

	public void setDuraçao(double duraçao) {
		this.duraçao = duraçao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Midia [gravadora=");
		builder.append(gravadora);
		builder.append(", duraçao=");
		builder.append(duraçao);
		builder.append("]");
		return builder.toString();
	}
	
}
