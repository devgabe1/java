package application;

import java.util.Scanner;

import util.MyNumber;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will be typed? ");
		MyNumber[] numberArray = new MyNumber[sc.nextInt()];

		for(int i = 0; i < numberArray.length; i++) {
			System.out.print("Enter a number: ");
			numberArray[i] = new MyNumber(sc.nextInt());
		}
		MyNumber numberObject = new MyNumber();
		numberObject.biggerNumberCalc(numberArray);
		
		System.out.print(numberObject);
		sc.close();
	}

}
