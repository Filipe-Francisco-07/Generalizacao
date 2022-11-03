package com.filipe.conta;

public class Conta {

	private String banco;
	private int agencia;
	private int numero_conta;
	private double saldo;

	public Conta(String banco, int agencia, int numero_conta, double saldo) {
		setBanco(banco);
		setAgencia(agencia);
		setNumero_conta(numero_conta);
		setSaldo(saldo);
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero_conta() {
		return numero_conta;
	}

	public void setNumero_conta(int numero_conta) {
		this.numero_conta = numero_conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Conta [banco=");
		builder.append(banco);
		builder.append(", agencia=");
		builder.append(agencia);
		builder.append(", numero_conta=");
		builder.append(numero_conta);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append("]");
		return builder.toString();
	}
	
}

