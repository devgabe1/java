package application;

import java.util.Scanner;

import util.Account;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		String holder;
		double initial_dep = 0;
		char confirm_initi_dep;
		
		System.out.print("Enter account number: ");
		number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		holder = sc.nextLine();
	
		System.out.print("Is there na initial deposit (y/n)? ");
		confirm_initi_dep = sc.next().charAt(0);
		
		if (confirm_initi_dep == 'y') {
			System.out.print("Enter initial deposit value: ");
			initial_dep = sc.nextDouble();
		}
		
		Account account = new Account(number, holder, initial_dep);
		
		System.out.print("\nAccount data:\n" + account);
		
		
		System.out.print("\n\nEnter a deposit value: ");
		Account.deposit(sc.nextDouble());
		System.out.print("Updated account data:\n" + account);
		
		System.out.print("\n\nEnter a withdraw value: ");
		Account.withdraw(sc.nextDouble());
		System.out.print("Updated account data:\n" + account);
		sc.close();
	}
	
}
