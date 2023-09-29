package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** A pythagorean theorem tester */
public class PythCheck {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		println("Welcome to Pythagorean Theorem Checker!");
		Double a = Double.parseDouble(prompt("Enter first side length: "));
		Double b = Double.parseDouble(prompt("Enter second side length: "));
		Double c = Double.parseDouble(prompt("Enter third side (hypotenuse) length: "));
		Double realC = Math.sqrt( Math.pow(a, 2) + Math.pow(b, 2) );
		
		if(realC.equals(c)) {
			println("That is a right triangle");
		}else if(realC > c) {
			println("That is an acute triangle");
		}else if(realC < c) {
			println("That is an obtuse triangle");
		}else {
			println("You did something weird!");
			println("C = " + c);
			println("Real C = " + realC);
		}
		
	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
}
