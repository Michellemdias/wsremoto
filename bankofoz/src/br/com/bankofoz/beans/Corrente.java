package br.com.bankofoz.beans;

import br.com.bakofoz.util.PadraoConta;

public class Corrente extends Conta implements PadraoConta{

	private float limite;
	private float taxa;
	
	public void aumentarLimite(float porc) {
		limite = limite + limite * (porc/100);
	}
	
	public void debitarTaxa() {
		super.setSaldo(super.getSaldo() - taxa);
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Limite: " + limite + "\n" +
				"Taxa: " + taxa;
	}
	
	public void setAll(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super.setAll(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public Corrente() {
		super();
	}
	public Corrente(short numero, byte digito, short agencia, float saldo, Cliente cliente, float limite, float taxa) {
		super(numero, digito, agencia, saldo, cliente);
		this.limite = limite;
		this.taxa = taxa;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	public float getTaxa() {
		return taxa;
	}
	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}

	@Override
	public boolean sacar(float valor) {
		if ((super.getSaldo() + limite) < valor ){
			return false;
		}else {
			super.setSaldo(super.getSaldo()+valor);
			return false;
		}
	}

	@Override
	public boolean depositar(float valor) {
		
		if(valor<=0) {
			return false;
		}else {
		setSaldo(super.getSaldo()+valor);
			return true;
		}
	}
	
	
	
}
