package com.filipe.veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Carro car = new Carro(true);
	car.setPortas(3);
		
	Caminhao truck = new Caminhao(true);
	truck.setEixos(6);

	Moto cycle = new Moto(true);
	cycle.setCilindradas(250);

	System.out.println(car);
	System.out.println(truck);
	System.out.println(cycle);
	}

}