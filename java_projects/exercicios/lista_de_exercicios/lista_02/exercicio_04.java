package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_04 {

	public static void main(String[] args) {
		int hr_inicial, hr_final, total;
		System.out.println("Cálculo horas de um jogo");

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a hora inical do jogo: ");
		hr_inicial = sc.nextInt();

		System.out.print("Insira a hora final do jogo: ");
		hr_final = sc.nextInt();

		if (hr_inicial < hr_final) {
			total = hr_final - hr_inicial;
		} else {
			total = 24 - hr_inicial + hr_final;
		}

		System.out.print("O jogo durou " + total + " horas.");
		sc.close();

	}

}
