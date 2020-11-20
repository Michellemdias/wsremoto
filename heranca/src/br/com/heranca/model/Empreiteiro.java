package br.com.heranca.model;

public class Empreiteiro extends Funcionario{

	private float valorEmpreita;
	
	public float calculaSalario() {
		
		return valorEmpreita;
	}

	public String getAll() {
		return
				super.getAll() + "\n" +
				"Valor Empreita: " + valorEmpreita 
				;
	} 
	
	public void setAll(String nome, int numeroRegistro, float valorEmpreita) {
		super.setAll(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	public Empreiteiro() {
		super();
	}

	public Empreiteiro(String nome, int numeroRegistro, float valorEmpreita) {
		super(nome, numeroRegistro);
		this.valorEmpreita = valorEmpreita;
	}

	public float getValorEmpreita() {
		return valorEmpreita;
	}

	public void setValorEmpreita(float valorEmpreita) {
		this.valorEmpreita = valorEmpreita;
	}
	
	
	
}
