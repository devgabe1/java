package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		int num;
		System.out.print("Leitura de números pares e ímpares\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O número é par.");
		}else {
			System.out.println("O número é impar.");
		}
		sc.close();
	}
}
