package ageMath;

import java.util.Scanner;

public class Age {

	private String[] name;
	private int[] age;
	private int olderIndex;
	
	public Age(int length) {
		this.name = new String[length];
		this.age = new int[length];
	}
		
	public void readData(Scanner sc) {
		for(int i = 0; i < age.length; i++) {
			System.out.printf("Person %d data\n", i+1);
			sc.nextLine();
			
			System.out.print("Name: ");
			name[i] = sc.nextLine();
			
			System.out.print("Age: ");
			age[i] = sc.nextInt();
		}
	}
	public void calcOlder () {
		int older = 0;
		for(int i = 0; i < age.length; i++) {
			if (age[i] > older) {
				older = age[i];
				olderIndex = i;
			}
		}
	}
	
	public void print() {
		System.out.print("Older person: ");
		System.out.println(name[olderIndex]);
	}
}
