package application;

import java.util.Scanner;

import util.currencyConverter;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		currencyConverter.dollarPrice = sc.nextDouble();
		
		System.out.print("\nHow many dollar will be bought? ");
		currencyConverter.dollarQuantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f", currencyConverter.converter());
	
		sc.close();
	}
}
