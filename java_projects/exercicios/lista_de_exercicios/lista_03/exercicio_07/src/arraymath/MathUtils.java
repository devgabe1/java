package arraymath;

import java.util.Scanner;

public class MathUtils {
	private double average;
	private double[] array;

	public MathUtils(int length) {
		this.array = new double[length];
	}

	public void readValues(Scanner sc) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextDouble();
		}
	}

	public double averageCalc() {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		average =  sum / array.length;
		return average;
	}

	public void printBelowArray() {
		for (double number : array) {
			if (number < average) {
				System.out.println(number);
			}
		}
	}
}