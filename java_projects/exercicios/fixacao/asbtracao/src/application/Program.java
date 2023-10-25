package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Payer;
import entities.companyPayer;
import entities.individualPayer;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Payer> payerList = new ArrayList<>();

		System.out.print("Enter the number os tax payers: ");
		int num = sc.nextInt();

		for(int i=1; i<= num; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			if(type != 'c' && type != 'i') {
				System.out.println("Invalid input.");
				return;
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double hexpenditures = sc.nextDouble();
				payerList.add(new individualPayer(name, income, hexpenditures));
			}
			else if(type == 'c') {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				payerList.add(new companyPayer(name, income, employees));
			}
		}
			System.out.println("\nTAXES PAID:");
			for(Payer c : payerList) {
				System.out.println(c.getName() + ": $ " + String.format("%.2f", c.taxPaid()));
			}

			System.out.print("\nTOTAL TAXES: $");
			double sum = 0;
			for(Payer c : payerList){
				sum +=  c.taxPaid();
			}
			System.out.println(sum);
			
		sc.close();
	}
}