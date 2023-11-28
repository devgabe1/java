package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert the path: ");
		String strpath = sc.next();
		File file = new File(strpath);
		boolean folderOut = new File(file.getParent() + "//out").mkdir();
		System.out.println(folderOut);

		try (BufferedReader br = new BufferedReader(new FileReader(file));
				BufferedWriter summary = new BufferedWriter(new FileWriter(file.getParent() + "//out//summary.csv"))){
			String line = br.readLine();
			
			while(line != null) {
				String[] parts = line.split(",");
				double value = Double.parseDouble(parts[1]);
				double quantity = Double.parseDouble(parts[2]);
				summary.write(parts[0] + ", " + value * quantity);
				summary.newLine();
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}
