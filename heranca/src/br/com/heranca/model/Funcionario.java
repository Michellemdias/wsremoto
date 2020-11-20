package br.com.heranca.model;

public abstract class Funcionario {
	protected String nome;
	protected int numeroRegistro;

	public abstract float calculaSalario();

	public String getAll() {
		return
				"Nome: " + nome + "\n" + 
				"NumeroRegistro: " + numeroRegistro
				;
	}

	public void setAll(String nome, int numeroRegistro) {

		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public Funcionario() {
		super();
	}
	public Funcionario(String nome, int numeroRegistro) {
		super();
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}




}
