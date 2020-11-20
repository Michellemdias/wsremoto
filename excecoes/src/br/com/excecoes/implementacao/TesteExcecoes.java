package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MinhaExcecao;

public class TesteExcecoes {
	
	/*
	 * Dois tipos de exce��es:
	 * Checked 		(AC) -> exce��es que ocorrem antes da compila��o , normalmente voltas para acesso a recursos externos. Ex. banco de dados, arquivos
	 * Unchecked	(DC) -> exce��es que s�o disparadas ap�s a compila��o.Ex. NullPointerException, NumberFormatException
	 */
	public static void main(String[] args) {
		try {									//se acontecer essa exce��o
			int numero = Integer.parseInt("7");
			System.out.println(numero);

			String nome = "";
			System.out.println("Qtde de letras: " + nome.length());
			
			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1] = 6.12;
			vetor[2] = 15.8;  // o vetor espera 2 posi��es, quando manda essa 3 d� exce��o
						
			
		} catch (Exception e) {					// tratamento da exce��o. Exception: classe pai da exce��o
			System.out.println(MinhaExcecao.tratar(e));
			
		} finally {							//executa independente de ter uma exce��o
			System.out.println("At� logo");
		}










	}

}
