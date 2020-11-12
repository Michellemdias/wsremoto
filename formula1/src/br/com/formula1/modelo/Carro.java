package br.com.formula1.modelo;

public class Carro {

	//Sintaxe do metodo no java
	// <modificador> <tipo do retorno> <nome do m�todo> (<tipo do param> <nome do param>) {
	private String escuderia;
	private short numero;
	private String cor;
	private float velocidadeAtual;
	private float valor;
	private boolean status;

	public void acelerar(float param) {
		if (status==true) {
			velocidadeAtual+=param;
		}
	}

	public void desacelerar(float param) {
		if (status==true && velocidadeAtual>param) {
			velocidadeAtual-=param;
		}
	}

	public void brecar() {
		if (status==true) {
			velocidadeAtual = 0;
		}
	}

	public float exibirVelocidadeAtual() {
		return velocidadeAtual;
	}

	public boolean exibirStatus()
	{
		return status;
	}
	public void preencherBasico(short param1, String param2, float param3) {
		numero=param1;
		escuderia=param2.toUpperCase();
		valor=param3;

	}

	public String exibirTudo() {
		String variavel = "LIGADO";
		if (status==false) {
			variavel = "DESLIGADO";
		}
		return 
				"EScuderia... " + escuderia + "\n" +
				"N�mero...... " + numero + "\n" +
				"Cor......... " + cor + "\n" +
				"Velocidade Atual " + velocidadeAtual + "\n" +
				"Valor....... " + valor + "\n" +
				"Status...... " + variavel;

	}

	public void preencherValor(float param) {
		valor=param;
	}
	public float retornarPromocao() {
		return valor * (float) 0.9;
	}

	public void preencherEscuderia(String param) {
		escuderia=param.toUpperCase();
	}

	public String retornarEscuderia() {
		return escuderia;
	}

	public void preencherNumero(short param) {
		if (param>0) {
			numero=param;
		}
	}

	public short retornarNumero() {
		return numero;
	}

	public String ligar() {
		status=true;
		return "Ligado";

	}

	public String desligar() {
		status=false;
		velocidadeAtual=0;
		return "Desligado";
	}

}//fecha classe
