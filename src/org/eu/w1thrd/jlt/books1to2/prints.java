package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** Testing System.out.println */
public class prints {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.println("Hello! \b");
		System.out.println("\t Hello!");
		System.out.println("\n Hello!");
		System.out.println("\f Hello!");
		System.out.println("\r Hello!");
		System.out.println("\" \' \\ ");
		
		System.out.print("Enter some text: ");
		String inp = sc.nextLine();
		System.out.println("You said: " + inp);
		
		System.out.print("Enter an Integer: ");
		String inp1 = sc.nextLine();
		System.out.print("Enter another Integer: ");
		String inp2 = sc.nextLine();
		Integer inp3 = Integer.parseInt(inp1) + Integer.parseInt(inp2);
		System.out.println("Those two numbers combine to make: " + Integer.toString(inp3));
		
		System.out.print("Enter a Float: ");
		inp1 = sc.nextLine();
		System.out.print("Enter another Float: ");
		inp2 = sc.nextLine();
		Float inp4 = Float.parseFloat(inp1) + Float.parseFloat(inp2);
		System.out.println("Those two numbers combine to make: " + Float.toString(inp4));
		
		System.out.print("Enter a boolean: ");
		inp = sc.nextLine();
		if(Boolean.parseBoolean(inp)) {
			System.out.println("Yes!");
		} else {
			System.out.println("No!");
		}
	}
}
