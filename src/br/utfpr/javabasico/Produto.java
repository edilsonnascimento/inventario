package br.utfpr.javabasico;

public class Produto {

	// Declara��o de campo de Inst�ncia
	private long numeroItem;
	private String nomeProduto;
	private int numUnidadeEstoque;
	private double precoUnitario;
	private boolean ativo = true;

	public void addToInventory(int quantidade) {
		this.setNumUnidadeEstoque(this.getNumUnidadeEstoque() + quantidade); 
	}
	
	public void deductFromInventory(int quantidade) {
		this.setNumUnidadeEstoque(this.getNumUnidadeEstoque() - quantidade);
	}
	
	// Construtor padr�o sem argumentos.
	public Produto() {
	}

	// Construtor deve ser inforado todos os campos para criar Produto
	public Produto(long numeroItem, String nomeProduto, int numUnidadeEstoque, double precoUnitario) {
		this.numeroItem = numeroItem;
		this.nomeProduto = nomeProduto;
		this.numUnidadeEstoque = numUnidadeEstoque;
		this.precoUnitario = precoUnitario;
	}

	public long getNumeroItem() {
		return numeroItem;
	}
	//O M�todo acima retorna o N�mero do Item do Produto

	public void setNumeroItem(long numeroItem) {
		this.numeroItem = numeroItem;
	}
	//O M�todo acima altera o N�mero do Item do Produto

	public String getNomeProduto() {
		return nomeProduto;
	}
	//O M�todo acima retorna o Nome do Produto
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	//O M�todo acima altera o Nome do Produto

	public int getNumUnidadeEstoque() {
		return numUnidadeEstoque;
	}
	//O M�todo acima retorna a quantidade de Produtos no Estoque.	

	public void setNumUnidadeEstoque(int numUnidadeEstoque) {
		this.numUnidadeEstoque = numUnidadeEstoque;
		
	}
	//O M�todo acima altera a quantidade de Produtos no Estoque.
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	//O M�todo acima retorna o pre�o unit�rio do Produtos.
	
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	//O M�todo acima altera o pre�o unit�rio do Produto.
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public String getStatus() {
		return isAtivo() ? "Ativo" : "Descontinuado";
	}
	
	public double getValorEstoque() {
		return this.getNumUnidadeEstoque() * this.getPrecoUnitario();
	}
	
	
	@Override
	public String toString() {
		return "N�mero do Item       : " + this.getNumeroItem()        + "\r\n" + 
			   "Nome                 : " + this.getNomeProduto()       + "\r\n" + 
			   "Quantidade em estoque: " + this.getNumUnidadeEstoque() + "\r\n" + 
			   "Pre�o                : " + this.getPrecoUnitario()     + "\r\n" +
			   "Valor do Estoque     : " + this.getValorEstoque()     + "\r\n" +
			   "Status do Produto    : " + this.getStatus()            + "\r\n" +
			   "";
	}
}
