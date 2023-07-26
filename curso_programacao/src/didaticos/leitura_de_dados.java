import java.util.Scanner;

public class leitura_de_dados {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char h;
		
		System.out.print("String: ");
		x = sc.nextLine();
		
		System.out.print("\nInt: ");
		y = sc.nextInt();
		
		System.out.print("\nDouble: ");
		z = sc.nextDouble();
		
		System.out.print("\nChar: ");
		h = sc.next().charAt(0);
		
		System.out.printf("\nString: %s\nInt: %d\nDouble: %.2f\nChar: %s", x, y, z, h);

		sc.close();

	}

}
