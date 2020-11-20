package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

public class TesteMap {

	public static void main(String[] args) {
	
			
		Map<Integer,String> lista = new HashMap<Integer,String>(); //primeiro indica o tipo de dado que não pode ser duplicado e segundo o que poderá
		lista.put(5505, "DBA");
		lista.put(5506, "DBA");
		lista.put(5530, "ANALISTA");
		lista.put(5599, "ESTAGIARIO");
		System.out.println(lista);
		System.out.println("Chaves: " + lista.keySet());
		System.out.println("Chaves: " + lista.values());
		
	}

}
