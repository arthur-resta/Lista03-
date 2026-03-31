package pctEx02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner receba = new Scanner(System.in);
		int option;
		double preco = 0;
		int quantidade;
		double num = 100;
		double num1= 10;
		double desconto;
		double valorfinal;
		
		
		System.out.println("Menu lanchonete");
		System.out.println("1- Hamburguer (15$)");
		System.out.println("2- Pizza (20$)");
		System.out.println("3- Refrigerante (5$)");
		System.out.println("Escolha a opção");
		
		option = receba.nextInt();
		System.out.println("Digite a quantidade");
		quantidade = receba.nextInt();
		
		switch(option) {
		case 1:
			if (quantidade >= 3)
			preco = 15 *quantidade;
			break;
		case 2:
			preco = 20 *quantidade;
			break;
		case 3:
			preco = 5 *quantidade;
			break;
			default :
				System.out.println("opçao invalida");
				
		}
		if (quantidade >= 3) {
			desconto = (preco/100)*10;
			valorfinal = preco-desconto;
			System.out.println("valor final com desconto: R$"+ valorfinal);
		}else {
		
		
		System.out.println("Total da compra R$ " + preco);
		}
	}
}