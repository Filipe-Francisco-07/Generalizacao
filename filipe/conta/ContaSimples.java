package com.filipe.conta;

public class ContaSimples extends Conta {

	private double saldoPoupanca;
	
	public ContaSimples(String banco, int agencia, int numero_conta, double saldo) {
		super(banco,agencia,numero_conta,saldo);
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append("ContaSimples [saldoPoupanca=");
		builder.append(saldoPoupanca);
		builder.append("]");
		return builder.toString();
	}

}
