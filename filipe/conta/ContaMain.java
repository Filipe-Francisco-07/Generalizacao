package com.filipe.conta;

public class ContaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContaSimples cs = new ContaSimples("Itaú",43122,234,200000);
		cs.setSaldoPoupanca(23232);
		System.out.println(cs);
	}

}
