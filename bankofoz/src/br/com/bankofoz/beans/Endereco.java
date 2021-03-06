package br.com.bankofoz.beans;

public class Endereco {

	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;




	public Endereco() {
		super();
	}

	public Endereco(String logradouro, int numero, String complemento, String bairro, String cidade, String uf,
			String cep) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public void SetAll(String logradouro, int numero, String complemento, String bairro, String cidade, String uf, String cep) {
		this.logradouro=logradouro;
		this.numero=numero;
		this.complemento=complemento;
		this.bairro=bairro;
		this.cidade=cidade;
		this.uf=uf;
		this.cep=cep;

	}

	public String getAll() {
		return 
				"Logradouro: " + logradouro + "\n" + 
				"Numero: " + numero + "\n" +
				"Complemento: " + complemento  + "\n" +
				"Bairro: " + bairro  + "\n" +
				"Cidade: " + cidade  + "\n" +
				"UF: " + uf  + "\n" +
				"Cep: " + cep
				;

	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}



}
