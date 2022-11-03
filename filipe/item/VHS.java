package com.filipe.item;

public class VHS extends Midia {

	private String titulo;
	
	public VHS(int codigo, String descriçao) {
		super(codigo,descriçao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("VHS [titulo=");
		builder.append(titulo);
		builder.append("]");
		return builder.toString();
	}
	
}
