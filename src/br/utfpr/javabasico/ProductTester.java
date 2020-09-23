package br.utfpr.javabasico;

public class ProductTester {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.setNumeroItem(10);
		p1.setNomeProduto("Geladeira");
		p1.setNumUnidadeEstoque(3);
		p1.setPrecoUnitario(2785.50);
		
		Produto p2 = new Produto();
		p2.setNumeroItem(20);
		p2.setNomeProduto("Fogão");
		p2.setNumUnidadeEstoque(2);
		p2.setPrecoUnitario(1500.75);
		
		Produto p3 = new Produto(30, "Mesa", 5, 780.6);
		Produto p4 = new Produto(40, "Sofa", 7, 3980.27);
		Produto p5 = new Produto(50, "Telvisor", 100, 5000.99);
		Produto p6 = new Produto(60, "Cama", 10, 1748.98);
		
		//Mostra produtos com toString
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		System.out.println(p5.toString());
		System.out.println(p6.toString());
		
	}

}
