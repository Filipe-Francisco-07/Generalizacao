package com.filipe.bomba;

public class BombaDiesel extends Bomba {

	public BombaDiesel(double totalLitros, float valorLitro) {
		super(totalLitros,valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("BombaDiesel []");
		return builder.toString();
	}
	
}
