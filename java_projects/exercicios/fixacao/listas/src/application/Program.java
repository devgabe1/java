package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List <Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");
		int lenght = sc.nextInt();

		for(int i = 0; i < lenght; i++) {
			System.out.println("\nEmployee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employee(id, name, salary));
		}		
		System.out.print("\nEnter the employee id that will have salary increase: ");
		int idIncrease = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);

		if(emp == null) { 
			System.out.print("This id does not exist!\n");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(idIncrease).increaseSalary(percentage);;
		}
		for(Employee print : list) {
			System.out.println(print);	
		}
		sc.close();
	}
}


