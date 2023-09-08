package application;
import java.util.Scanner;

import entities.Calc;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		Calc[] numeros = new Calc[n];

		for(int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = new Calc();
			numeros[i].setN(sc.nextInt());
		}
		
		System.out.println("\nNúmeros negativos:");
		for(int i = 0; i < numeros.length; i++) {
			if (numeros[i].getN() < 0 ) {
				System.out.println(numeros[i].getN());
			}
		}
		sc.close();
	}
}
