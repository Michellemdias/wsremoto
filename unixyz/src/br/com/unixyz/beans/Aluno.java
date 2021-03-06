package br.com.unixyz.beans;

/*
 * Design Pattern -> cole��o de boas praticas (padr�es) OO (orientacao a objetos)
 * DTO (Data Transfer Object) -> ensina a melhor forma de criar uma classe modelo
 *1� Todos os atributos devem ser privados
 *2�  Cada atributo deve possuir um getter (output) e um setter (input)
 *3�  Toda classe deve possuir no minimo um construtor vazio + um construtor para todos os atributos (cheio). Em source -> Generate Constructor fieds
 * Obs: Modelo = Beans = JavaBeans = TO = DTO = Model
 */


public class Aluno {
	
	private int rm;
	private String nome;
	private String email;
	// para montar os metodos set e get clicar em Source -> Generates and Setters
	
	
	
	public String getAll() {    
		return
				"RM: " + rm + "\n" + 
				"Nome: " + nome + "\n" +
				"Email: " + email;
	}
	
	public Aluno() {      // construtor
		super();
	}

	public Aluno(int rm, String nome, String email) {
		super();
		this.rm = rm;
		this.nome = nome;
		this.email = email;
	}

	
	
	
	public void setAll(int rm, String nome, String email) {
		this.rm=rm;
		this.nome=nome;
		this.email=email;
	}
	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) { // preencher
		this.rm = rm;  // usa o this para apontar quem � o atributo
	}
	public String getNome() { //get retornar
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
