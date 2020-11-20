package br.com.excecoes.tratamento;

import java.sql.SQLException;

public class MinhaExcecao {
	
	public static String tratar(Exception e) {
		if (e instanceof NullPointerException) {
			return "Objeto está nulo";
		}else if (e instanceof NumberFormatException) {
			return "Número inválido";
		}else if (e instanceof SQLException) {
			return "Erro no banco de dados";
		}else if (e instanceof ArrayIndexOutOfBoundsException) {
			return "Vetor estourou";
		}else {
			e.printStackTrace();
			return "Exceção não tratada";
			//throw new RuntimeException(); // o programador está lançando a exceção
		}
		
		
		
				
	}

	
	
	
	
	
	
}
