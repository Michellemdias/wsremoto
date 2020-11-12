package br.com.liveup.implementacao;

import br.com.liveup.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador teste = new Elevador();
		

		teste.prepararElevador(10, 0, 5);
		teste.subir();
		teste.entrar(2);
		System.out.println(teste.retornarTudo());
		teste.entrar(2);
		teste.subir();
		teste.entrar(2);
		teste.subir();
		System.out.println(teste.retornarTudo());
		
	}

}
