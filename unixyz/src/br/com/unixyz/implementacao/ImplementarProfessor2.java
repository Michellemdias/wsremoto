package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor2 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		Endereco endereco = new Endereco();
		professor.SetAll(1, "Michelle", "Doutor", "123", endereco);
		
		endereco.SetAll("Rua x", "2", "2", "x", "sp", "sp", "00");
		

		System.out.println(professor.getAll());	
	}

}
