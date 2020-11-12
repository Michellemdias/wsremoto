package br.com.xpto.modelo;

public class Televisao {

	private String marca;
	private float valorVenda;
	private float valorCompra;
	private int volume;
	private int canal;
	private boolean status;
	
	
	public void  preencherMarca(String pMarca) {
		marca=pMarca;
	}
	
	public void preencherValorCompra(float pValor) {
		valorCompra=pValor;
	}
	
	public String definirValorVenda() {
		valorVenda=valorCompra * (float) 0.9 ;
		return "Valor compra: " + valorVenda;
}
	
	public void ligar() {
		status=true;
		
	}
	
	public void desligar() {
		status=false;
		volume=0;
	}
	
	public String retornarStatus() {
		if (status==true) {
			return "Ligada";
		} else {
			return "Desligada";
		}
	}
	
	public void aumentarVolume() {
		
		if (status==true && volume<20) {
			volume++;
		}
	}
	
	public void diminuirVolume() {
		if (status==true && volume>0) {
			volume--;
		}
	}
	
	public void mudarCanal(int pCanal) {
		
		if (status==true) {
			if (canal >0 && canal <999) {
				canal=pCanal;
			}
		}
	}
	
	public String retornarResumo() {
		return 
				"Status" + status + "\n" +
				"Canal" + canal + "\n" +
				"Volume" + volume + "\n" +
				"Valor de Venda" + valorVenda + "\n" +
				"Valor de Compra" + valorCompra;
	}
	
	
	
	
}
