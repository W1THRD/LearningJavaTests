package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;
/** Tests for nested logical operators and ternary operators */
public class LogOps {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// Nested Logical Operators
		println("a = 5");
		Integer a = 5; 
		println("b = 7");
		Integer b = 7; 
		Boolean result = ((a < b) ^ (b > a));
		println("((a < b) ^ (b > a)) = " + result.toString() + "\n");
		
		// ternary operator
		println("a = 5");
		a = 5; 
		b = (randRange(1, 2) == 1) ? a : 3;
		println("b = " + b);
		result = (a > b) ? true : false;
		println("(a > b) ? true : false = " + result.toString() + "\n");
		
		// ternary for counting
		Integer c = Integer.parseInt(prompt("Enter in an integer: "));
		println("You have " + c + ((c > 1) ? " apples" : " apple"));
	}
	
	public static void println(String text) { System.out.println(text); }
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	
	public static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}
