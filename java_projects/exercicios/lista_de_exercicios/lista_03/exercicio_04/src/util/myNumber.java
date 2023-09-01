package util;

public class myNumber {
	
	private int quantity = 0;
	private int number;
	private String pairNumbers = "";
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int numbers) {
		this.number = numbers;
	}
	public myNumber(int numbers) {
		this.number = numbers;
	}
	
	public myNumber() {
	}
	
	public String pairNumbers(myNumber numbers[]) {
		
		for(myNumber number : numbers) {
			if (number.getNumber() % 2 == 0) {
				pairNumbers += number.getNumber() + " ";
				quantity ++;
			}
		}
		return "Pair numbers:\n" + pairNumbers + "\nAmount of pairs = " + quantity;
	}
}
