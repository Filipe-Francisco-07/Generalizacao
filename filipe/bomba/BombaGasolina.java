package com.filipe.bomba;

public class BombaGasolina extends Bomba {

	public BombaGasolina(double totalLitros, float valorLitro) {
		super(totalLitros,valorLitro);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("BombaGasolina []");
		return builder.toString();
	}
	
}
