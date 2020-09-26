package br.utfpr.javabasico;

public class CD extends Produto {

	private String artista;
	private int quantidadeMusica;
	private String selo;

	public CD(long numeroItem, String nomeProduto, int numUnidadeEstoque, double precoUnitario, String artista, int quantidadeMusica, String selo) {
		super(numeroItem, nomeProduto, numUnidadeEstoque, precoUnitario);
		this.artista = artista;
		this.quantidadeMusica = quantidadeMusica;
		this.selo = selo;
	}

	public String getArtista() {
		return artista;
	}

	public int getQuantidadeMusica() {
		return quantidadeMusica;
	}

	public String getSelo() {
		return selo;
	}
	
	@Override
	public String toString() {	 
		return  "N�mero do Item        : " + this.getNumeroItem()        + "\r\n" + 
				"Nome                  : " + this.getNomeProduto()       + "\r\n" +
				"Artista               : " + this.getArtista()           + "\r\n" +
				"M�sica do �lbum       : " + this.getQuantidadeMusica()      + "\r\n" +
				"Selo de grava��o      : " + this.getSelo()              + "\r\n" +				
				"Quantidade em estoque : " + this.getNumUnidadeEstoque() + "\r\n" + 
				"Pre�o                 : " + this.getPrecoUnitario()     + "\r\n" +
				"Valor do Estoque      : " + this.getValorEstoque()      + "\r\n" +
				"Status do Produto     : " + this.getStatus()            + "\r\n" +
				"";	
	}

}
