package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		int cod, qnt;
		double total = 0;
		System.out.println("Cardápio");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o código desejado: ");
		cod = sc.nextInt();
		
		System.out.print("Insira a quantidade desejada: ");
		qnt = sc.nextInt();
		
		if (cod == 1) {
			total = qnt * 4;
		}else if (cod == 2) {
			total = qnt * 4.5;
		}else if (cod == 3) {
			total = qnt * 5;
		}else if (cod == 4) {
			total = qnt * 2;
		}else if (cod == 5) {
			total = qnt * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f", total);
		sc.close();
	}

}
