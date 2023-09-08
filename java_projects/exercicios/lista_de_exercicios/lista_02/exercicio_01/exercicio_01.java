package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		int num;
		
		System.out.println("Leitura de número positivo ou negativo\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira um número: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("O número informado é negativo.");
		}else {
			System.out.println("O número informado é positivo.");
		}
		
		sc.close();
	}

}
