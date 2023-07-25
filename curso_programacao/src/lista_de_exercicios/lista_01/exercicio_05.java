package lista_de_exercicios.lista_01;

import java.util.Scanner;

public class exercicio_05 {

	public static void main(String[] args) {
		
		int cod_1, num_1, cod_2, num_2;
		double preco_1, preco_2, valor;
		
		System.out.println("Calcular o valor de compra de 2 peças");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o cód. da peça 1: ");
		cod_1 = sc.nextInt();
		
		System.out.print("Insira o número de peças: ");
		num_1 = sc.nextInt();
		
		System.out.print("Insira o valor unitário da peça 1: R$ ");
		preco_1 = sc.nextDouble();
		
		System.out.print("\nInsira o cód. da peça 2: ");
		cod_2 = sc.nextInt();
		
		System.out.print("Insira o número de peças: ");
		num_2 = sc.nextInt();
		
		System.out.print("Insia o valor unitário da peça 2: R$ ");
		preco_2 = sc.nextDouble();
		
		valor = num_1 * preco_1 + num_2 * preco_2;
		
		System.out.printf("\nValor a ser pago R$ %.2f", valor);
		
		sc.close();

	}

}
