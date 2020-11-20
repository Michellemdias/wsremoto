package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MinhaExcecao {
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto est� nulo";
		}else if (e instanceof NumberFormatException) {
			return "N�mero inv�lido";
		}else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exce��o n�o tratada";
			//throw new RuntimeException(); // o programador est� lan�ando a exce��o
		}
		
		
		
				
	}

	
	
	
	
	
	
}
