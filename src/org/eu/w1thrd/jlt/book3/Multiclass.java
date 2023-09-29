package org.eu.w1thrd.jlt.book3;

import java.util.Scanner;

/** A test with using other classes */
public class Multiclass {
	public static void main (String[] args) {
		// println
		common.println("Hello! There are two classes in this file!");
		
		// pomptInt
		Integer num1 = common.promptInt("Enter an Integer: ");
		num1 *= 2;
		common.println("The nmber doubled is: " + num1);
		
		// promptFloat
		Float num2 = common.promptFloat("Enter a Float: ");
		num2 /= 2;
		common.println("The number halfed is: " + num2);
		
		// prompt
		String str = common.prompt("Enter a String: ");
		str = str + str + str;
		common.println("The String repeated is: " + str);
	}
}

class common{
	static Scanner sc = new Scanner(System.in);
	
	public static String prompt(String text) {
		sc.nextLine();
		System.out.print(text);
		return(sc.nextLine());
	}
	public static Integer promptInt(String text) {
		System.out.print(text);
		return(sc.nextInt());
	}
	public static Float promptFloat(String text) {
		System.out.print(text);
		return(sc.nextFloat());
	}
	public static void println(String text) { System.out.println(text); }
}
