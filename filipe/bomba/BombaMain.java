package com.filipe.bomba;

public class BombaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BombaGasolina gasosa = new BombaGasolina(32,6);
		gasosa.abastecerLitro(76);
		
		System.out.println(gasosa);
	}

}
