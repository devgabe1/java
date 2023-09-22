package application;

import java.util.Scanner;

import entities.Department;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter department's name: " );
		Department dep_name = new Department(sc.nextLine());
		
		System.out.println("Enter worker data: ");
		
		
		
		sc.close();
	}

}
