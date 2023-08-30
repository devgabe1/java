package application;

import java.util.Scanner;

import util.Data;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will be typed? ");
		Data[] dataArray = new Data[sc.nextInt()];

		for (int i = 0; i < dataArray.length; i++) {

			System.out.println((i + 1) + " Person Data: ");
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			System.out.print("Height: ");
			float height = sc.nextFloat();

			dataArray[i] = new Data(name, age, height);
		}
		Data dataObject = new Data();
		
		
		float average = dataObject.average_height(dataArray);

		System.out.println(average);
		sc.close();
	}
}