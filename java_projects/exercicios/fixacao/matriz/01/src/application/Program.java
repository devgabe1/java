package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Type the length of the matrix: ");
		int length = sc.nextInt();
		
		int[][] matrix;
		matrix = new int[length][length];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Main diagonal:");
		for(int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		
		int count = 0;
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println();
		System.out.print("Negative numbers = " + count);
		sc.close();
	}

}
