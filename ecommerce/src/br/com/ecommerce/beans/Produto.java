package br.com.ecommerce.beans;

public class Produto {

	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int id;
	private int qtde;
	
	public void setAll(String descricao, float valorVenda, float valorCompra, int id, int qtde) {
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.id = id;
		this.qtde = qtde;
	}
	
	public String getAll() {
		return 
				"Descri��o: " + descricao + "\n" + 
				"Valor da Venda	: " + valorVenda + "\n" +
				"Valor Compra: " +valorCompra  + "\n" +
				"ID: " +id  + "\n" +
				"Quantidade: " + qtde  
				;
	}
	
	
	
	public Produto() {
		super();
	}
	public Produto(String descricao, float valorVenda, float valorCompra, int id, int qtde) {
		super();
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.id = id;
		this.qtde = qtde;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
}
