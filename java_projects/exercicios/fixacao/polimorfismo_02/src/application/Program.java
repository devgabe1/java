package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List <Product> ProductList = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();

		for(int i=1; i<=quantity; i++) {
			System.out.println("Product #"+ i +" data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char status = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();

			if(status == 'c') {
				ProductList.add(new Product(name, price));
			}
			else if(status == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				ProductList.add(new UsedProduct(name, price, date));
			}
			else if(status == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				ProductList.add(new ImportedProduct(name, price, customsFee));	
			}
		}
		System.out.println("\nPRICE TAGS:");
		for (Product c : ProductList) {
			System.out.println(c.priceTag());
		}
		sc.close();
	}
}
