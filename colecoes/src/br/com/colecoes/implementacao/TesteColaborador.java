package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.beans.Colaborador;
import br.com.colecoes.util.Magica;

public class TesteColaborador {

	public static void main(String[] args) {
		
		Colaborador colaborador = new Colaborador();		
		colaborador.setCpf(Magica.s("CPF"));
		colaborador.setNome(Magica.s("Nome"));

		List<String> lista = new ArrayList<String>();
		do {
			lista.add(Magica.s("Digite o numero do telefone:"));
		}
		while(JOptionPane.showConfirmDialog(null, "Cadastrar telefone?", "Pergunta",JOptionPane.YES_NO_OPTION)==0);
	
		colaborador.setFone(lista);
	
	System.out.println("Nome: " + colaborador.getNome());
	System.out.println("CPF: " + colaborador.getCpf());
	
	
	System.out.println("Fones: " + colaborador.getFone());
	//OU
	for (int contador=0;contador<lista.size();contador++) {
		System.out.println("Fone " + contador + ":" + lista.get(contador));
	}
	}

}


