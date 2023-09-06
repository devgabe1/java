package application;

import java.util.Scanner;

import dataPerson.Person;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be typed? ");
		int length = sc.nextInt();

		Person people = new Person(length);

		people.readData(sc);
		people.calcAverage();
		people.print();
		
		sc.close();
	}

}
