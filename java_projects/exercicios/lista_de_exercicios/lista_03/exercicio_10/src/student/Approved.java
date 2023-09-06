package student;

import java.util.Scanner;

public class Approved {
	private String[] name;
	private double[] firstGrade;
	private double[] secondGrade;
	private double[] average;

	public Approved(int length) {
		this.name = new String[length];
		this.firstGrade = new double[length];
		this.secondGrade = new double[length];
		this.average = new double[length];
	}

	public void readData(Scanner sc, int length) {
		for(int i = 0; i < length; i++) {
			System.out.printf("Enter name, first and second grade of %d student:\n", i + 1);
			sc.nextLine();
			
			name[i] = sc.nextLine();
			firstGrade[i] = sc.nextDouble();
			secondGrade[i] = sc.nextDouble();		
		}
	}

	public void calcGrade(int length) {
		for (int i = 0; i < length; i++) {
			average[i] = (firstGrade[i] + secondGrade[i]) / 2;
		}
	}

	public void print(int length) {
		System.out.println("Approved students: ");

		for (int i = 0; i < length; i++) {
			if (average[i] >= 6.0) {
				System.out.println(name[i]);
			}
		}
	}
}
