package br.com.liveup.modelo;

public class Elevador {

	private int andarAtual;
	private int andarMaximo;
	private int andarMinino;
	private int capacidadePessoas;
	private int qtdePessoas;
	private String nome;
	
	public void prepararElevador(int pAndarMaximo, int pAndarMinino, int pCapacidade) {
		andarMaximo = pAndarMaximo;
		andarMinino = pAndarMinino;
		capacidadePessoas = pCapacidade;
	}
	
	
	public void entrar(int pQtde) {
		if ((pQtde+ qtdePessoas)<=capacidadePessoas)
			qtdePessoas+=pQtde;
	}
	
	public void sair(int pQtde) {
		if ((qtdePessoas-pQtde)>=0) {
			qtdePessoas-=pQtde ;
		}
	}
	
	
	public void subir() {
		if(andarAtual<andarMaximo) {
		andarAtual++;
		}
	}
	
	public void descer() {
		if(andarAtual>andarMinino) {
		andarAtual--;
		}
	}
	
	public String retornarTudo() {
		return 
				"Andar Atual........ " + andarAtual + "\n" +
				"Andar Maximo....... " + andarMaximo + "\n" +
				"Andar Minimo....... " + andarMinino + "\n" +
				"Capacidade......... " + capacidadePessoas + "\n" +
				"Qtde Atual......... " + qtdePessoas + "\n" +
				"Nome............... " + nome;
				
				
	}
	
	
	
}
