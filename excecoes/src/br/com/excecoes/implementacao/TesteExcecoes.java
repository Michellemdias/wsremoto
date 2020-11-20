package br.com.excecoes.implementacao;

import br.com.excecoes.tratamento.MinhaExcecao;

public class TesteExcecoes {
	
	/*
	 * Dois tipos de exceções:
	 * Checked 		(AC) -> exceções que ocorrem antes da compilação , normalmente voltas para acesso a recursos externos. Ex. banco de dados, arquivos
	 * Unchecked	(DC) -> exceções que são disparadas após a compilação.Ex. NullPointerException, NumberFormatException
	 */
	public static void main(String[] args) {
		try {									//se acontecer essa exceção
			int numero = Integer.parseInt("7");
			System.out.println(numero);

			String nome = "";
			System.out.println("Qtde de letras: " + nome.length());
			
			double vetor[] = new double[2];
			vetor[0] = 5.54;
			vetor[1] = 6.12;
			vetor[2] = 15.8;  // o vetor espera 2 posições, quando manda essa 3 dá exceção
						
			
		} catch (Exception e) {					// tratamento da exceção. Exception: classe pai da exceção
			System.out.println(MinhaExcecao.tratar(e));
			
		} finally {							//executa independente de ter uma exceção
			System.out.println("Até logo");
		}










	}

}
