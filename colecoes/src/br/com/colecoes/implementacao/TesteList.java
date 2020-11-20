package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();

		lista.add("ANALISTA");
		lista.add("DBA");
		lista.add("DESENVOLVEDOR");
		lista.add("DBA");
		lista.add("ESTAGIÁRIO");

		System.out.println(lista);
		System.out.println("Exibindo o segundo elementeo " + lista.get(1));

		int totalDBA = 0;
		int qtdeCargos8c = 0;

		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Elemento " + contador + ": " + lista.get(contador));
			if (lista.get(contador).equals("DBA")) {
				totalDBA++;
			}
			if (lista.get(contador).length() >8) {
				qtdeCargos8c++;
			}
		}

		System.out.println("Total de DBA: " + totalDBA);
		System.out.println("Qtde Cargo com mais de 8 caracteres: " + qtdeCargos8c);
		Collections.sort(lista);
		System.out.println("Lista ordenada" + lista);
		lista.remove(2);
		System.out.println("Lista com terceiro elemento removido" + lista);

	}

}
