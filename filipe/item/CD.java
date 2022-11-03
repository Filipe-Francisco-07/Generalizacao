package com.filipe.item;

public class CD extends Midia {

	private int faixas;
	private String artistas;
	private String album;
	
	public CD(int codigo, String descriçao) {
		super(codigo,descriçao);
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}

	public String getArtistas() {
		return artistas;
	}

	public void setArtistas(String artistas) {
		this.artistas = artistas;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("CD [faixas=");
		builder.append(faixas);
		builder.append(", artistas=");
		builder.append(artistas);
		builder.append(", album=");
		builder.append(album);
		builder.append("]");
		return builder.toString();
	}
	
}
