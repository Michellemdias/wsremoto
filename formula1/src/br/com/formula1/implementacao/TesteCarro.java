package br.com.formula1.implementacao;

import javax.swing.JOptionPane;

import br.com.formula1.modelo.Carro;

public class TesteCarro {

	public static void main(String[] args) {
		// Instanciando um objeto => criar as reparticoes desse objeto
		Carro objeto = new Carro();
		//objeto.preencherEscuderia("ferrari");
		//objeto.preencherEscuderia(JOptionPane.showInputDialog("Escuderia:"));
		System.out.println(objeto.retornarEscuderia());
		
		objeto.preencherNumero((short)1);
		System.out.println(objeto.retornarNumero());
		
		objeto.ligar();
		System.out.println(objeto.ligar());
		
		//objeto.desligar();
		//System.out.println(objeto.desligar());
		
		objeto.preencherValor((float)50.000);
		
		objeto.retornarPromocao();
		System.out.println("Desconto do carro:" + objeto.retornarPromocao());
		
		objeto.preencherBasico((short)123, "Ferrari", 50000);
		
		objeto.exibirTudo();
		System.out.println(objeto.exibirTudo());
		
		objeto.acelerar(50);
		System.out.println(objeto.exibirVelocidadeAtual());
		
		objeto.desacelerar(10);
		System.out.println(objeto.exibirVelocidadeAtual());
		
		objeto.brecar();
		System.out.println(objeto.exibirVelocidadeAtual());
		System.out.println(objeto.exibirStatus());
	}

}
