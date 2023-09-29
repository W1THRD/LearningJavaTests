package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** A type-safe scanner app */
public class safescan {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Integer pp3 = 0;
		System.out.print("Enter first number: ");
		String p1 = sc.nextLine();
		System.out.print("Enter second number: ");
		String p2 = sc.nextLine();
		try {
			pp3 = Integer.parseInt(p1) + Integer.parseInt(p2);
		}
		catch(Exception e) {
			System.out.println("Hey! That doesn't work");
			System.exit(6);
		}
		
		String p3 = Integer.toString(pp3);
		System.out.println("That adds up to: " + p3);
	}
}
