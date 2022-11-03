package com.filipe.item;

public class ItemMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Midia m = new Midia(1,"dado");	
    m.setDuraçao(6);
    m.setGravadora("DDM");
	
	Livro l = new Livro(1,"dado");
	l.setAutor("Rowling");
	
	CD c = new CD(1,"dado");
	c.setAlbum("blue pen");
	c.setArtistas("blue pen '-' ");
	c.setFaixas(5);
	
	VHS v = new VHS(1,"dado");	
	v.setTitulo("Um título foda.");
	
	
	System.out.println(c);
	
	}

}
