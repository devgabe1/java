package application;

import java.util.Scanner;

import util.myNumber;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers will be typed? ");
		
		myNumber[] numberArray = new myNumber[sc.nextInt()];
		
		for(int i = 0; i < numberArray.length; i++) {
			
			System.out.print("Enter a number: ");		
			numberArray[i] = new myNumber(sc.nextInt());	
		}
		myNumber numberObject = new myNumber();
		System.out.println("\n" + numberObject.pairNumbers(numberArray));
		sc.close();
	}

}
