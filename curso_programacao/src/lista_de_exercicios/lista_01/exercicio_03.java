package lista_de_exercicios.lista_01;

import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		int a, b, c, d, diferenca;
		
		System.out.println("Calcular a diferença do produto de 4 valores\n");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o valor de A: ");
		a = sc.nextInt();
		
		System.out.print("Insira o valor de B: ");
		b = sc.nextInt();
		
		System.out.print("Insira o valor de C: ");
		c = sc.nextInt();
		
		System.out.print("Insira o valor de D: ");
		d = sc.nextInt();
	
		sc.close();
	
		diferenca = a * b - c * d;
		
		System.out.print("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
	
	}

}
