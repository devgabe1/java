package application;

import java.util.Scanner;

import util.Numbers;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many numbers will each vector have?" );
		
		int length = sc.nextInt();
		
		Numbers numbersArrayA = new Numbers(length);
		Numbers numbersArrayB = new Numbers(length);
		
		System.out.println("Enter the values of Array A: ");
		numbersArrayA.readValues(sc);
		
		System.out.println("Enter the values of Array B: ");
		numbersArrayB.readValues(sc);
		
		numbersArrayA.add(numbersArrayB);
		
        System.out.println("Resulting Array: ");
        numbersArrayA.printArray();
		sc.close();

	}

}
