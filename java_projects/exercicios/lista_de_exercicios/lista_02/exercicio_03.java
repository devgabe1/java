package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		int a, b;
		System.out.println("Leitura de números múltiplos\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		a = sc.nextInt();
		
		System.out.print("\nInsira o valor de B: ");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("\nOs números são múltiplos.");
		} else {
			System.out.println("\nOs números não são múltiplos.");
		}
		
		sc.close();
	}

}
