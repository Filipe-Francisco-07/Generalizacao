package com.filipe.musica;

public class Percussao extends InstrumentoMusical {

	private boolean baquetas;
	
	public Percussao(String nome) {
		super(nome);
	}

	public boolean isBaquetas() {
		return baquetas;
	}

	public void setBaquetas(boolean baquetas) {
		this.baquetas = baquetas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Percussao [baquetas=");
		builder.append(baquetas);
		builder.append("]");
		return builder.toString();
	}

}
