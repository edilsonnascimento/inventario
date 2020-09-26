package br.utfpr.javabasico;

public class DVD extends Produto {

	private int duracaoMinutos;
	private int classificaoEtaria;
	private String estudioCinematografico;

	public DVD(long numeroItem, String nomeProduto, int numUnidadeEstoque, double precoUnitario,int duracaoMinutos, int classificaoEtaria, String estudioCinematografico) {
		super(numeroItem, nomeProduto, numUnidadeEstoque, precoUnitario);
		this.duracaoMinutos = duracaoMinutos;
		this.classificaoEtaria = classificaoEtaria;
		this.estudioCinematografico = estudioCinematografico;
	}

	public int getDuracaoMinutos() {
		return duracaoMinutos;
	}

	public void setDuracaoMinutos(int duracaoMinutos) {
		this.duracaoMinutos = duracaoMinutos;
	}

	public int getClassificaoEtaria() {
		return classificaoEtaria;
	}

	public void setClassificaoEtaria(int classificaoEtaria) {
		this.classificaoEtaria = classificaoEtaria;
	}

	public String getEstudioCinematografico() {
		return estudioCinematografico;
	}

	public void setEstudioCinematografico(String estudioCinematografico) {
		this.estudioCinematografico = estudioCinematografico;
	}
	
	@Override
	public double getValorEstoque() {
		return super.getValorEstoque() + (super.getValorEstoque() * 0.05);
	}

	@Override
	public String toString() {
		return  "Número do Item          : " + this.getNumeroItem()             + "\r\n" + 
				"Nome                    : " + this.getNomeProduto()            + "\r\n" +
				"Duração do Filme        : " + this.getDuracaoMinutos()         + "\r\n" +
				"Classificação Etária    : " + this.getClassificaoEtaria()      + "\r\n" +
				"Estúdio Cinematográfico : " + this.getEstudioCinematografico() + "\r\n" +				
				"Quantidade em estoque   : " + this.getNumUnidadeEstoque()      + "\r\n" + 
				"Preço                   : " + this.getPrecoUnitario()          + "\r\n" +
				"Valor do Estoque        : " + this.getValorEstoque()           + "\r\n" +
				"Status do Produto       : " + this.getStatus()                 + "\r\n" +
				"";	
	}
}
