package com.filipe.item;

public class Livro extends Item {

	private String autor;
	
	public Livro(int codigo, String descriçao) {
		super(codigo,descriçao);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("Livro [autor=");
		builder.append(autor);
		builder.append("]");
		return builder.toString();
	}
	
	
}
