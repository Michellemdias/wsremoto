package br.com.xpto.implementacao;

import br.com.xpto.modelo.Televisao;

public class TesteTelevisao {

	public static void main(String[] args) {
		Televisao objeto = new Televisao();
		
		
		objeto.preencherMarca("ABC");
		objeto.preencherValorCompra(50);
		objeto.definirValorVenda();
		System.out.println(objeto.definirValorVenda());
		
		objeto.ligar();
		System.out.println(objeto.retornarResumo());
		
		objeto.aumentarVolume();
		objeto.aumentarVolume();
		System.out.println(objeto.retornarResumo());
		
		
		
		
		
		
		
	}

}
