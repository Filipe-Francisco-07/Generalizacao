package com.filipe.bomba;

public class BombaEtanol extends Bomba {

	public BombaEtanol(double totalLitros, float valorLitro) {
		super(totalLitros,valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("BombaEtanol []");
		return builder.toString();
	}

}
