package util;

import java.util.Scanner;

public class Numbers {
	private int[] array;

	public Numbers(int length) {
		this.array = new int[length];
	}

	public void readValues(Scanner sc) {
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}

	public void add(Numbers arrayB){
		for (int i = 0; i < array.length; i++) {
			array[i] += arrayB.array[i];
		}
	}
	
    public void printArray() {
        for (int value : array) {
            System.out.println(value);
        }
    }
}

