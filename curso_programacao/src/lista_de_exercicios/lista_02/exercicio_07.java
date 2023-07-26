package lista_de_exercicios.lista_02;

import java.util.Scanner;

public class exercicio_07 {

	public static void main(String[] args) {
		double x, y;
		System.out.println("Determinar o quadrante de dois valores\n");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de x: ");
		x = sc.nextDouble();
		
		System.out.print("Insira o valor de y: ");
		y = sc.nextDouble();
		
		if(x == 0 && y == 0) {
			System.out.println("Ponto de origem.");
		}else if(x > 0 && y > 0) {
			System.out.println("Q1");
		}else if(x < 0 && y > 0) {
			System.out.println("Q2");
		}else if(x < 0 && y < 0) {
			System.out.println("Q3");
		}else if(x > 0 && y < 0) {
			System.out.println("Q4");
		}		
		sc.close();
	}

}
