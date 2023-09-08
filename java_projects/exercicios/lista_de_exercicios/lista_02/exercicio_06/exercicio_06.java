package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		double num;
		System.out.println("Informar intervalo de um valor\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		num = sc.nextDouble();
		
		if (num < 0 || num > 100) {
			System.out.println("Valor fora de intervalo.");
		}else if(num <= 25) {
			System.out.println("Intervalo [0,25]");
		}else if(num <= 50) {
			System.out.println("Intervalo [25,50]");
		}else if(num <= 75) {
			System.out.println("Intervalo [50,75]");
		}else if(num <= 100) {
			System.out.println("Intervalo [75,100]");
		}
		sc.close();
	}
}
