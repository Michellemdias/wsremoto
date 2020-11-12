package br.com.unixyz.implementacao;

import br.com.unixyz.beans.Endereco;
import br.com.unixyz.beans.Professor;

public class ImplementarProfessor {

	public static void main(String[] args) {
		Professor p = new Professor();
		Endereco e = new Endereco();
		p.setId(1);
		p.setNome("Pascoli");
		p.setTitulacao("Doutor");
		p.setFone("123456");
		p.setEndereco(e);
		e.setLogradouro("Av Paulista");
		e.setNumero("1500");
		e.setBairro("Centro");
		e.setCidade("São Paulo");
		e.setUf("SP");
		e.setCep("05000-000");
		e.setComplemento("ap x");
		
		System.out.println("Nome " + p.getNome());
		System.out.println(p.getEndereco().getAll());
	}

}
