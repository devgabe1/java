package entitites;

import java.util.Scanner;

public class Student {

	public double grade_1, grade_2, grade_3, finalGrade;
	public String name;
	
	Scanner sc = new Scanner(System.in);
	
	public void getTheGrades() {
		grade_1 = sc.nextDouble();
		grade_2 = sc.nextDouble();
		grade_3 = sc.nextDouble();
		finalGrade = grade_1 + grade_2 + grade_3;
	}
	public void reportCard() {
		if (finalGrade >= 60) {
			System.out.printf("Final grade = %.2f\n", finalGrade);
			System.out.print("PASS");
		}else {
			System.out.printf("Final grade = %.2f\n", finalGrade);
			System.out.print("FAILED");
			System.out.printf("\nMissing %.2f points", 60 - finalGrade);
		}
	}
}
