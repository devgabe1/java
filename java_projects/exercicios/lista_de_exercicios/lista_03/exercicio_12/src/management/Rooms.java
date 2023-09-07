package management;

import java.util.Scanner;

public class Rooms {
	private int[] room;
	private String[] name;
	private String[] email;
	
	public Rooms() {
		this.room = new int[10];
		this.name = new String[10];
		this.email = new String[10];
	}
	
	public void readData(Scanner sc, int lenght) {
		for(int i = 0; i < lenght; i++) {
			String nameTemp = null;
			String emailTemp = null;
			int roomTemp = 0;
			
			System.out.println("Rent #" + (i+1));
			sc.nextLine();
			
			System.out.print("Name: ");
			nameTemp = sc.nextLine();
			
			System.out.print("Email: ");
			emailTemp = sc.nextLine();
			
			System.out.print("Room: ");
			roomTemp = sc.nextInt();
			
			name[roomTemp] = nameTemp;
			email[roomTemp] = emailTemp;
			room[roomTemp] = roomTemp;
		}
	}
	
	public void printRooms() {
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < 10; i++) {
			if (name[i] != null) {
				System.out.printf("%d: %s, %s\n", room[i], name[i], email[i]);
			}
		}
	}
}
