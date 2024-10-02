package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Verification_numbers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int limit_number, number;
		
		System.out.println("Type how much times the program will be execute: ");
		limit_number = scan.nextInt();
		
		Verification_numbers[] n = new Verification_numbers[limit_number];
		
		for(int i = 0; i < n.length; i ++) {
			System.out.println("Type the number: ");
			number = scan.nextInt();
			n[i] = new Verification_numbers(number);
		}
		
		for(int i = 0; i < n.length; i++) {
			n[i].negative_or_not();
		}
		
		scan.close();
	}

}
