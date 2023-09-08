package application;

import java.util.Scanner;

import util.Calc;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();

		Calc[] numeros = new Calc[n];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = new Calc();
			numeros[i].setN(sc.nextDouble());
		}
		
		System.out.print("Valores: ");
		double soma = 0;
		double media = 0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i].getN() + " ");
			soma += numeros[i].getN();
		}
		System.out.println("\nSoma = " + soma);
		
		media = soma / numeros.length;
		System.out.print("Média = " + media);

		
		sc.close();
	}
}
