package com.filipe.pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	PessoaFisica f = new PessoaFisica("Cláudio","RJ");
	f.setCpf("123.123.123.12");
	f.setEstado_civil("Casado");
	System.out.println(f);
	
	PessoaJuridica j = new PessoaJuridica("Patricia","SP");
	j.setCnpj("12345678901234");
	j.setTipoEmpresa("Tecnologia");
	System.out.println(j);
		
	}

}
