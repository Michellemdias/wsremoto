package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor3 {

	public static void main(String[] args) {
		Professor professor = new Professor(
				1,
				"Pascoalli",
				"Doutor",
				"123456",
				new Endereco(
						"AV Paulista",
						"1500",
						"ap x",
						"CEntro",
						"S�o Paulo",
						"SP",
						"05005-000"
						)
				);

		System.out.println(professor.getAll());
	}

}
