package br.com.bankofoz.implementacao;

import java.io.ObjectInputStream.GetField;

import br.com.bakofoz.util.Magica;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;

public class ImplementarConta {

	public static void main(String[] args) {
		Conta conta = new Corrente();

		int opcao = Magica.i("Digite 1 Corrente e 2 Poupança:");

		while (opcao!=1 || opcao!=2) {
			opcao=Magica.i("Digite somente 1 ou 2");
		}
		if (opcao == 1) {
			conta = new Corrente(
					 Magica.i("Número da Conta"),
					 Magica.i("Digito da Conta")
					);

		}else {
			conta = new Poupanca(
					(short) Magica.i("Número"),
					(byte) Magica.i("Digito"),
					(short) Magica.i("Agencia")
					
					
					);
		}

		

conta.depositar(50);
System.out.println(conta.getSaldo());





	}

}
