package lista_de_exercicios.lista_01;

import java.util.Scanner;

public class exercicio_06 {

	public static void main(String[] args) {
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
		
		System.out.println("Cálculo de áreas\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o valor de A: ");
		a = sc.nextDouble();
		
		System.out.print("Insira o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Insira o valor de C: ");
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		circulo = c * c * 3.14159;
		trapezio = ((a + b) * c) / 2;
		quadrado = b * b;
		retangulo = a * b;
		
		System.out.printf("\nA área do triângulo retângulo é %.3f", triangulo);
		System.out.printf("\nA área do círculo é %.3f", circulo);
		System.out.printf("\nA área do trapézio é %.3f", trapezio);
		System.out.printf("\nA área do quadrado é %.3f", quadrado);
		System.out.printf("\nA área do retângulo é %.3f", retangulo);
		
		sc.close();
		
		
		

	}

}
