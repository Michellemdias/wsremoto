package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
import br.com.colecoes.util.Magica;

public class TestListObjeto {

	public static void main(String[] args) {
		List<Cargo> lista = new ArrayList<Cargo>();
		//1º forma de adicionar
		lista.add(new Cargo(
				Magica.s("Cargo"),
				Magica.s("Nível"),
				Magica.f("Salario")
				));

		//2º forma de adicionar
		Cargo objeto = new Cargo();
		objeto.setNome(Magica.s("Cargo"));
		objeto.setNivel(Magica.s("Nivel"));
		objeto.setSalario(Magica.f("Salario"));
		lista.add(objeto);
		// Fim da segunda forma

		System.out.println("Nome do primeiro cargo " + lista.get(0).getNome());

		int contJr = 0;
		float totalSalarios =0;
		for (int cont=0;cont<lista.size();cont++) {
			if (lista.get(cont).getNivel().equals("JR")) {
			contJr++;
			}
			System.out.println("Cargo número "+ (cont+1));
			System.out.println("Nome do Cargo: " + lista.get(cont).getNome());
			System.out.println("Nivel do Cargo: " + lista.get(cont).getNivel());
			System.out.println("S: " + lista.get(cont).getSalario());
			totalSalarios+=lista.get(cont).getSalario();
			
		}
		
		System.out.println("Média entre todos os salários é: " + totalSalarios/lista.size());
		System.out.println("Qtde de JRs: " + contJr);			
		
		
	}
	
	

}
