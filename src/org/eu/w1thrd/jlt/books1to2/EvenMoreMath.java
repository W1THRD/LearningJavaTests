package org.eu.w1thrd.jlt.books1to2;

import java.util.Scanner;

/** Class that tests the various methods of the Math class, calculates user input */
public class EvenMoreMath {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// Advanced Math Stuff
		println("Welcome to yet another math program!");
		Double num1 = Double.parseDouble(prompt("Enter number 1: "));
		Double num2 = Double.parseDouble(prompt("Enter number 2: "));
		
		Double a = Math.abs(num1) * Math.signum(num2);
		println("Number 1 forced to the sign of Number 2: " + a);
		Double b = Math.abs(num2) * Math.signum(num1);
		println("Number 2 forced to the sign of Number 1: " + b);
		
		println("Number 1 Squared: " + Math.pow(num1, 2));
		println("Number 1 Cubed: " + Math.pow(num1, 3) + "\n");
		
		// 2D Distance
		println("Time for 2D Distance!");
		Double x1 = Double.parseDouble(prompt("Enter First X coordinate: "));
		Double y1 = Double.parseDouble(prompt("Enter First Y coordinate: "));
		//Double z1 = Double.parseDouble(prompt("Enter First Z coordinate: "));
		Double x2 = Double.parseDouble(prompt("Enter Second X coordinate: "));
		Double y2 = Double.parseDouble(prompt("Enter Second Y coordinate: "));
		//Double z2 = Double.parseDouble(prompt("Enter Second Z coordinate: "));
		Double d2d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		println("The Distance is: " + d2d + "\n");
		
		// 2D Distance
		println("Time for 3D Distance!");
		x1 = Double.parseDouble(prompt("Enter First X coordinate: "));
		y1 = Double.parseDouble(prompt("Enter First Y coordinate: "));
		Double z1 = Double.parseDouble(prompt("Enter First Z coordinate: "));
		x2 = Double.parseDouble(prompt("Enter Second X coordinate: "));
		y2 = Double.parseDouble(prompt("Enter Second Y coordinate: "));
		Double z2 = Double.parseDouble(prompt("Enter Second Z coordinate: "));
		Double d3d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2) + Math.pow((z2 - z1), 2));
		println("The Distance is: " + d3d + "\n");
	}
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
	
}
