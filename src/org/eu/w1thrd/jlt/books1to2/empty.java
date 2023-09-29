package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** Empty starter class, made as a starter for other classes */
public class empty {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {

	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
}
