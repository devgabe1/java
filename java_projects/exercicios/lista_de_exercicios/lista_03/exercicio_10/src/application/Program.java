package application;

import java.util.Scanner;

import student.Approved;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be typed? ");
		int length = sc.nextInt();
		
		Approved students = new Approved(length);
		
		students.readData(sc, length);
		students.calcGrade(length);
		students.print(length);
		
		sc.close();
	}

}
