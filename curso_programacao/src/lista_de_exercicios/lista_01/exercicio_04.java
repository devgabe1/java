package lista_de_exercicios.lista_01;

import java.util.Scanner;


public class exercicio_04 {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		double horas, valor_hora, salario;
		
		System.out.println("Calculo de salário\n");
		
		System.out.print("Insira o número do funcionário: ");
		num = sc.nextInt();
		
		System.out.print("Insira o número de horas trabalhadas: ");
		horas = sc.nextDouble();
		
		System.out.print("Insira o valor por hora trabalhada: ");
		valor_hora = sc.nextDouble();
		
		salario = horas * valor_hora;
		
		System.out.println("Número do funcionário: " + num);
		System.out.printf("Salário R$ %.2f", salario);
		
		
		sc.close();
	} 	

}
