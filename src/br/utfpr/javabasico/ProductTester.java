package br.utfpr.javabasico;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		long tempNumber;
		String tempName;
		int tempQty;
		double tempPrice;
		int maxSize = -1;

		System.out.println("Insira o número de produtos que gostaria de adicionar\r\n"
				+ " Insira 0 (zero) se não quiser adicionar produtos: ");

		while (maxSize < 0) {
			try {
				maxSize = in.nextInt();
				if (maxSize == 0) {
					break;
				} else if (maxSize < 0) {
					System.out.println("Valor incorreto inserido");
					in.nextLine();
				}
			} catch (Exception e) {
				System.out.println("Tipo incorreto de dados inserido!");
				in.nextLine();
			}
		}

		if (maxSize == 0) {
			System.out.println("Não ha produtos!");
		} else {
			Produto[] produtos = new Produto[maxSize];
			for (int i = 0; i < maxSize; i++) {
				in.hasNextLine();
				System.out.println();
				System.out.print("Entre com o código do Produto: ");
				tempNumber = in.nextLong();
				System.out.print("Entre com a descrição do Produto: ");
				tempName = in.next();
				System.out.print("Entre com a quantidade em estoque do Produto: ");
				tempQty = in.nextInt();
				System.out.print("Entre com o preço do Produto: ");
				tempPrice = in.nextDouble();
				produtos[i] = new Produto(tempNumber, tempName, tempQty, tempPrice);
			}

			for (Produto produto : produtos) {
				System.out.println(produto);
			}
		}
		in.close();
	}

}
