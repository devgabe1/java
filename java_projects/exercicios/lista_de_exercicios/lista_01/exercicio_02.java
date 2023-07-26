package lista_de_exercicios.lista_01;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		
		System.out.println("Calcular a área de um círculo\n");
		
		double area, raio;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o raio do círculo: ");
		raio = sc.nextDouble();
		
		area = raio * 3.14159;
		
		System.out.printf("A área do círculo é igual á: %.4f", area);
		
		sc.close();
	}

}
