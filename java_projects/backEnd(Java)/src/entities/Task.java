package entities;

import java.util.Scanner;

import status.enums.Status;

public class Task {

	private TaskData[] tasks;
	Scanner sc = new Scanner(System.in);
	
	public Task(int numberOfTasks) {
		this.tasks = new TaskData[numberOfTasks];
	}
	
	public void updateTask (String nameTask) {

		for(int i = 0; i < title.length; i++) {
			if(title[i] == nameTask) {
				System.out.println("What do you want to update?");
				System.out.println("1 - title/n2-description/n3-status");
				int option = sc.nextInt();
				
				if(option == 1) {
					System.out.println("current title: " + title[i]);
					System.out.print("new title: ");
					String titlea =sc.nextLine();
					title[i].setTitle(titlea);

				}
			}
		}
	}
}

