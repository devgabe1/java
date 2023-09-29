package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name: ");
		String nameClient = sc.nextLine();
		System.out.print("Email: ");
		String emailClient = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(nameClient, emailClient, birthDate);
		
		sc.nextLine();
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String statusOrder = sc.nextLine();
		Date moment = new Date();
		Order order = new Order(moment, OrderStatus.valueOf(statusOrder), client);
			
		System.out.print("How many items to this order? ");
		int itemsQuantity = sc.nextInt();
		
		for(int i = 0; i<itemsQuantity; i++) {
			System.out.printf("Enter #%d item data:\n", i+1);
			System.out.print("Product name: ");
			sc.nextLine();
			String nameProduct = sc.nextLine();
			System.out.print("Product price: ");
			Double priceProduct = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityProduct = sc.nextInt();
			Product product = new Product(nameProduct, priceProduct);
			OrderItem item = new OrderItem(quantityProduct, priceProduct, product);
		}
		sc.close();
	}
}
