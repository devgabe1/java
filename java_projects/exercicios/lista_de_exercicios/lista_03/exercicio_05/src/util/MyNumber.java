package util;

public class MyNumber {

	private int number;
	private int position;
	private int higherNumber;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getHigherNumber() {
		return higherNumber;
	}
	public void setHigherNumber(int higherNumber) {
		this.higherNumber = higherNumber;
	}

	public MyNumber(int number) {
		this.number = number;
	}

	public MyNumber() {
		// Initialize instance variables in the constructor
		position = -1; // No position set initially
		higherNumber = Integer.MIN_VALUE; // Smallest possible int value

	}

	public void biggerNumberCalc(MyNumber numberArray[]){
		for (int i = 0; i < numberArray.length; i++) {
			if(numberArray[i].getNumber() > higherNumber) {
				higherNumber = numberArray[i].getNumber();
				position = i;
			}
		}
	}

	public String toString() {
		return "Bigger number = " + higherNumber + "\nPosition of the largest number =  " + position;
	}

}
