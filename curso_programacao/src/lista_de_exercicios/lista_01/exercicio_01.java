package lista_de_exercicios.lista_01;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {

		int a, b, c;
		System.out.println("Apresentar a soma de dois valores\n\n");

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o valor de A: ");
		a = sc.nextInt();

		System.out.print("\nInsira o valor de B: ");
		b = sc.nextInt();

		sc.close();

		c = a + b;
		System.out.printf("\nA soma de A e B é igual a: %d", c);

	}

}
