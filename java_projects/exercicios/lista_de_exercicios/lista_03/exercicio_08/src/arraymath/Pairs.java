package arraymath;

import java.util.Scanner;

public class Pairs {
	private double[] array;
	private double averagePairs;

	public Pairs(int length) {
		this.array = new double[length];
	}

	public void readValues(Scanner sc) {
		for(int i = 0; i < array.length; i++) {
			System.out.print("Type a number: ");
			array[i] = sc.nextDouble();
		}
	}

	public void averageCalc() {
		double sum = 0;
		int pairs = 0;

		for(int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum += array[i];
				pairs ++;
			}
		}
		averagePairs = (pairs == 0) ? 0 : sum / pairs;
	}

	public void print() {
		if(averagePairs == 0) {
			System.out.print("No even number.");
		}else {
			System.out.print("Peer average: " + String.format("%.1f", averagePairs));
		}
	}
}