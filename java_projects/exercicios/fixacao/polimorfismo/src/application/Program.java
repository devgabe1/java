package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> EmployeeList = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int quantity = sc.nextInt();
		
		for(int i=1; i<=quantity; i++) {
			System.out.println("\nEmployee #" + i);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				EmployeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			}
			else {
				EmployeeList.add(new Employee(name, hours, valuePerHour));
			}	
		}
		System.out.println("\nPAYMENTS: ");
		for (Employee c : EmployeeList) {
			System.out.println(c.getName() + " - $ " + String.format("%.2f", c.payment()));
		}
		sc.close();
	}
}
