package com.filipe.bomba;

public class Bomba {

	private double totalLitros;
	private float valorLitro;
	
	public Bomba(double totalLitros, float valorLitro) {
		setTotalLitros(totalLitros);
		setValorLitro(valorLitro);
	}

	public double getTotalLitros() {
		return totalLitros;
	}

	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}

	public float getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}
	
	public double abastecerLitro(double lt) {
		
		return lt*valorLitro;
	}
	
	public double abastecerValor(double val) {
		
		return val*totalLitros;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("[Abastecer por valor=");
		builder.append(abastecerValor(valorLitro));
		builder.append("[Abastecer por Litro=");
		builder.append(abastecerLitro(totalLitros));
		builder.append("]");
		return builder.toString();
	}
	
}
