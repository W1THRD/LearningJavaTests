package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** A simple random number gen */
public class Random {
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) {
		Integer a = randRange(Integer.parseInt(prompt("Enter Minimum value: ")), Integer.parseInt(prompt("Enter Maximum value: ")));
		println("Random number: " + a);
	}
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
	public static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}
