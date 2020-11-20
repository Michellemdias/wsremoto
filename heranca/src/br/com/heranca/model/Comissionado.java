package br.com.heranca.model;

public class Comissionado extends Funcionario {
	private float salarioBase;
	private float comissao;
	
	public float calculaSalario() {
		
		 return salarioBase+salarioBase * comissao/100;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"Sal�rio Base: " + salarioBase + "\n" +
				"Comiss�o : " + comissao 
				;
	} 
	
	public void setAll(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super.setAll(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	public Comissionado() {
		super();
	}
	public Comissionado(String nome, int numeroRegistro, float salarioBase, float comissao) {
		super(nome, numeroRegistro);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public float getComissao() {
		return comissao;
	}
	public void setComissao(float comissao) {
		this.comissao = comissao;
	}

	




}
