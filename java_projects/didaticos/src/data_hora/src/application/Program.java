package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		System.out.println("Instanciação");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		//Gravar o momento
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();	
		
		//Gravar uma String como data
		LocalDate d04 = LocalDate.parse("2003-07-28"); //formato ISO8601
		LocalDateTime d05 = LocalDateTime.parse("2003-07-28T23:42:21"); //formato ISO8601
		Instant d06 = Instant.parse("2003-07-28T23:42:21Z"); //formato ISO8601
		Instant d07 = Instant.parse("2003-07-28T23:42:21-03:00");
		
		
		//Formatar uma String e gravar como data
		LocalDate d08 = LocalDate.parse("28/07/2023", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("28/07/2023 01:44", fmt2);

		
		LocalDate d10 = LocalDate.of(2003, 7, 28);
		LocalDateTime d11 = LocalDateTime.of(2003, 7, 28, 23, 42);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
		
		//formatação
		System.out.println("\n\nFormatação");
		LocalDate d12 = LocalDate.parse("2003-07-28"); 
		LocalDateTime d13 = LocalDateTime.parse("2003-07-28T23:42:21");
		Instant d14 = Instant.parse("2003-07-28T23:42:21Z"); 
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d12 = " + d12.format(fmt3));
		System.out.println("d12 = " + fmt3.format(d12));
		System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	
		System.out.println("d13 = " + d13.format(fmt3));
		System.out.println("d13 = " + d13.format(fmt4));
		
		System.out.println("d14 = " + fmt5.format(d14));
		System.out.println("d13 = " + d13.format(fmt6));
		System.out.println("d14 = " + fmt7.format(d14));
	}	
}
