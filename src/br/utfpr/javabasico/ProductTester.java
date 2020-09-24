package br.utfpr.javabasico;

import java.util.Scanner;

public class ProductTester {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		long tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		
		System.out.print("Entre com o código do Produto: ");
		tempNumber = in.nextLong();
		System.out.print("Entre com a descrição do Produto: ");
		tempName = in.next();
		System.out.print("Entre com a quantidade em estoque do Produto: ");
		tempQty = in.nextInt();
		System.out.print("Entre com o preço do Produto: ");
		tempPrice = in.nextDouble();
		Produto p1 = new Produto(tempNumber, tempName, tempQty, tempPrice);
		System.out.println(p1.toString());
		
		//quebra de linha
		System.out.println();
		//limpar buffer.
		in.nextLine();
		
		System.out.print("Entre com o código do Produto: ");
		tempNumber = in.nextLong();
		System.out.print("Entre com a descrição do Produto: ");
		tempName = in.next();
		System.out.print("Entre com a quantidade em estoque do Produto: ");
		tempQty = in.nextInt();
		System.out.print("Entre com o preço do Produto: ");
		tempPrice = in.nextDouble();
		System.out.print("Entre com o preço do Produto: ");
		tempPrice = in.nextDouble();
		System.out.println();
		Produto p2 = new Produto(tempNumber, tempName, tempQty, tempPrice);		
		System.out.println(p2.toString());
	    
		in.close();
		
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
		System.out.println("Tirando item:  " + p6.getNumeroItem() + " do estoque...");
	    p6.setAtivo(false);
		System.out.println(p6.toString());		
	    

				
	}

}
