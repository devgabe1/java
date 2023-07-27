package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rectangle width: ");
		rectangle.width = sc.nextDouble();
	
		System.out.print("Enter rectangle height: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area = " + rectangle.area());
		System.out.println("Perimeter = " + rectangle.perimeter());
		System.out.println("Diagonal = " + rectangle.diagonal());
		
		sc.close();
	}

}
