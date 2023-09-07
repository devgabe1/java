package application;

import java.util.Scanner;

import management.Rooms;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int length = sc.nextInt();
		
		Rooms busyRooms = new Rooms();
		
		busyRooms.readData(sc, length);
		busyRooms.printRooms();
		
		sc.close();
	}
}
