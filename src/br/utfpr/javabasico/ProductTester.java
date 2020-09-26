package br.utfpr.javabasico;

import java.io.IOException;
import java.util.Scanner;

public class ProductTester {
	static long tempNumber;
	static String tempName;
	static int tempQty;
	static double tempPrice;
	static int maxSize = -1;
	static Scanner in = new Scanner(System.in);
	
	public static int  getProductNumber(Produto[] produtos, Scanner in) {
		boolean continua = true;
		int productChoice = 0;
		int maxArray = produtos.length;
		
		for (int i = 0; i < maxArray; i++) {
			System.out.println("Indice: " + i + " - " + "Nome do Produto: " + produtos[i].getNomeProduto());
		}
		
		while(continua) {			
			try {
				productChoice = in.nextInt();
				if( (productChoice == 0) || (productChoice == 1)) {
					continua = false;
				}else if (productChoice < maxArray) {
					continua = false;
				}
			} catch (Exception e) {
				System.out.println("Tipo incorreto de dados inserido!");
				in.nextLine();				
			}
		}
		
		return productChoice;
		
	}

	public static void addInventory(Produto[] produtos, Scanner in) {
		int productChoice = getProductNumber(produtos, in);
		int updateValue = -1;
		boolean continua = true;
		 
		System.out.println("Quantos produtos deseja adicionar?");
		while(continua) {
			try {
				updateValue = in.nextInt();
				if(updateValue >= 0) continua = false;		
			} catch (Exception e) {
				System.out.println("Tipo incorreto de dados inserido!");
				in.nextLine();
			}
		}		
		produtos[productChoice].addToInventory(updateValue);		
	}
	
	public static void deductInventory(Produto[] produtos, Scanner in) {
		int productChoice = getProductNumber(produtos, in);
		int updateValue = -1;
		boolean continua = true;
		int quantidadeAtualEstoque = produtos[productChoice].getNumUnidadeEstoque();
		 
		System.out.println("Quantos produtos deseja retirar do estoque? Saldo atual: " + quantidadeAtualEstoque);
		while(continua) {
			try {
				updateValue = in.nextInt();
				if((updateValue >= 0) && (updateValue <= quantidadeAtualEstoque)) continua = false;		
			} catch (Exception e) {
				System.out.println("Tipo incorreto de dados inserido!");
				in.nextLine();
			}
		}		
		produtos[productChoice].deductFromInventory(updateValue);		
	}
	
	public static void discontinueInventory(Produto[] produtos, Scanner in) {
		int productChoice = getProductNumber(produtos, in);		
		produtos[productChoice].setAtivo(false);		
	}
	
	public static void executeMenuChoice(int optionMenu, Produto[] produtos, Scanner in) {
		switch (optionMenu) {
			case 1  :  displayInventaroy(produtos);
			           break;
			case 2  :  addInventory(produtos, in);
			           break;
			case 3  :  deductInventory(produtos, in);
			           break;
			case 4  :  discontinueInventory(produtos, in);
			           break;
		}
	}
	
	//Método Principal	
	public static void main(String[] args) {
		//create a Scanner Object for keybord input
		Scanner in = new Scanner(System.in);
		int maxSize, menuChoice;
		
		maxSize = getNumProducts(in);
		if(maxSize == 0) {
			//Display a no products message if zero is entered
			System.out.println("No products requered!");
		}else {
			Produto[] produtos = new Produto[maxSize];
			addToInventory(produtos, in);
			do {
				menuChoice = getMenuOption(in);
				executeMenuChoice(menuChoice, produtos, in);
			}while(menuChoice != 0);
		}//endif
		
		//free resource Scanner
		in.close();
	}//end method main

	public static void addToInventory(Produto[] produtos, Scanner in) {
		
		for (int i = 0; i < maxSize; i++) {
			in.nextLine();
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
	}

	public static void displayInventaroy(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}
	
	public static int getNumProducts(Scanner in) {
		
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
		return maxSize;
	}
	
	public static int getMenuOption(Scanner in) {
		boolean continua = true;
		int op = 0;
		
		System.out.println();
		System.out.println("1. Exibir Inventário \r\n" +
							"2. Adicionar Estoque \r\n" +
							"3. Deduzir Estoque \r\n"+
							"4. Descontinuar Produto \r\n"+
							"0. Sair \r\n"+
							"Insira uma opção de menu:\r\n");
		while(continua) {
			try {
				op = in.nextInt();
				if( op == 0) {
					in.close();
					System.exit(0);
				}else if ((op > 0) && (op <=4)){
					continua = false;
				}
			} catch (Exception e) {
				System.out.println("Tipo incorreto de dados inserido!");
				in.nextLine();				
			}
		}
		return op;
	}
}

