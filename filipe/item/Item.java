package com.filipe.item;

public class Item {

	private int codigo;
	private String descriçao;
	
	public Item(int codigo, String descriçao) {
		setCodigo(codigo);
		setDescriçao(descriçao);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		this.descriçao = descriçao;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [codigo=");
		builder.append(codigo);
		builder.append(", descriçao=");
		builder.append(descriçao);
		builder.append("]");
		return builder.toString();
	}
	
}
