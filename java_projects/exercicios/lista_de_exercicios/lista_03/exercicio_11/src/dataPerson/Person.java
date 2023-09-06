package dataPerson;

import java.util.Scanner;

public class Person {
	private double[] height;
	private char[] gender;
	private double shortestHeight = Double.MAX_VALUE;
	private double greaterHeight = Double.MIN_VALUE;
	private double averageHeigthWoman = 0;
	private int numberMan = 0;

	public Person(int length) {
		this.height = new double[length];
		this.gender = new char[length];
	}

	public void readData(Scanner sc){
		for(int i = 0; i < height.length; i++) {
			System.out.printf("%d person height: ", i+1);
			height[i] = sc.nextDouble();

			System.out.printf("%d person gender: ", i+1);
			gender[i] = sc.next().charAt(0);
		}
	}

	public void calcAverage() {
		double sumWoman = 0;
		int numberWoman = 0;

		for(int i = 0; i < height.length; i++) {	
			if(shortestHeight > height[i]) {
				shortestHeight = height[i];
			}else if(greaterHeight < height[i]) {
				greaterHeight = height[i];
			}
			if(gender[i] == 'F' || gender[i] == 'f') {
				sumWoman += height[i];
				numberWoman++;
			}else if(gender[i] == 'M' || gender[i] == 'm') {
				numberMan++;
			}
		}
		averageHeigthWoman = sumWoman / numberWoman;
	}

	public void print() {
		System.out.println("Shortest Height = " + shortestHeight);
		System.out.println("Grester Height = " + greaterHeight);
		System.out.printf("Average height of women = %.2f\n", averageHeigthWoman);
		System.out.println("Number of men = " + numberMan);
	}
}
