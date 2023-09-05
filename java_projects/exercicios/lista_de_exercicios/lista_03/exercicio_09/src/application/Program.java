package application;

import java.util.Scanner;

import ageMath.Age;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be type? ");
		int length = sc.nextInt();
		
		Age people = new Age(length);
		
		people.readData(sc);
		people.calcOlder();
		people.print();
		
		sc.close();
	}

}
