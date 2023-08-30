package util;

public class Account {

		private static int number;
		private static String holder;
		private static double balance;
		
		public Account (int number, String holder, double balance) {
			Account.number = number;
			Account.holder = holder;
			Account.balance = balance;
		}
		public Account (int number, String holder) {
			Account.number = number;
			Account.holder = holder;
		}
		
		public static int getNumber() {
			return number;
		}
		public static String getHolder() {
			return holder;
		}
		public static void setHolder(String holder) {
			Account.holder = holder;
		}
		public static double getBalance() {
			return balance;
		}
		
		public static void deposit(double amount) {
			balance += amount;
		}
		
		public static void withdraw(double amount) {
			balance -= amount;
			balance -= 5;
		}
		public String toString() {
			return "Account " + number + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
		}
		
		
}
