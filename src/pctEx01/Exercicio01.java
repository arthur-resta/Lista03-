package pctEx01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		char option;
		double preco = 0;
		int quantidade;
		
		System.out.println("Menu Padaria");
		System.out.println("a- café (4$)");
		System.out.println("b- Suco(6$)");
		System.out.println("c- Sanduiche (10$)");
		System.out.println("Escolha a opção");
		
		option = receba.next().charAt(0);
		System.out.println("Digite a quantidade");
		quantidade = receba.nextInt();
		
		switch(option) {
		case 1:
			preco = 4 *quantidade;
			break;
		case 2:
			preco = 6 *quantidade;
			break;
		case 3:
			preco = 10 *quantidade;
			break;
			default :
				System.out.println("opçao invalida");
				
		}
		System.out.println("Total da compra R$ " + preco);
		
	}

}