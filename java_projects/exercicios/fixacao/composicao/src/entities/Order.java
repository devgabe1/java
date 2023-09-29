package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat sdf =  new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items= new ArrayList<>();
	private Client client;

	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItem(OrderItem item) {
		items.add(item);
	}

	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Double total() {
		Double total = (double) 0;
		for(OrderItem c : items) {
			total += c.subTotal();
		}
		return total;
	}

	public String toString() {
		StringBuilder print = new StringBuilder();
		print.append("ORDER SUMMARY:\n");
		print.append("Order moment: " + sdf.format(moment));
		print.append("\nClient: " + client);
		print.append("\nOrder items:\n");
		for(OrderItem c : items) {
			print.append(c + "\n");
		}
		print.append("Total price: $" + total());
		return print.toString();
		}
	
	
}
