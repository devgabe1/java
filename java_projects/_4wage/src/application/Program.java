package application;

import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee infos:");
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.print("\nEmployee: " + employee);
		
		System.out.print("\nWhich percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		
		System.out.println("Updated data: " + employee);
		
		sc.close();
	}
}
