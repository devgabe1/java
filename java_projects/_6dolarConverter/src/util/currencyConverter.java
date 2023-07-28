package util;

public class currencyConverter {
	
	public static double dollarPrice;
	public static double dollarQuantity;
	
	public static double converter() {
		return (dollarPrice * dollarQuantity) + (dollarPrice * dollarQuantity * 0.06);
	}
}
