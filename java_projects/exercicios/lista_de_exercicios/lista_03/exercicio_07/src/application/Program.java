package application;

import java.util.Scanner;

import arraymath.MathUtils;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("how many numbers will vector have? ");
		int length = sc.nextInt();
		
		MathUtils array = new MathUtils(length);
		array.readValues(sc);
		
		System.out.print("Array average: ");
		System.out.println(array.averageCalc());
		
		System.out.println("Numbers under the average: ");
		array.printBelowArray();
		
		sc.close();
	}

}
