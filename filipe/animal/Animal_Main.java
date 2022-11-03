package com.filipe.animal;

public class Animal_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Mamifero m = new Mamifero("Baleia");
	m.setTempo_amamentaçao(7);
	System.out.println(m);
	
	Reptil r = new Reptil("Cobra");
	r.setPeso_ovo(2);
	System.out.println(r);

	}

}
