package application;

import java.util.Scanner;

import entitites.Student;

public class Program {
	
	public static void main(String[] args) {
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the student name: ");
	student.name = sc.nextLine();
	
	System.out.println("Enter the grades of the quarters: ");
	student.getTheGrades();
	
	student.reportCard();
	sc.close();
	}
}
