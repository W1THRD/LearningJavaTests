package org.eu.w1thrd.jlt.book3;

import java.util.Scanner;
import java.util.regex.Pattern;

// Improved I/O class for the console
public class IOPlus {
	// Scanner instance for scanning input
	private static Scanner sc = new Scanner(System.in);
	
	// prompt classes
	public static String promptString(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	
	public static Integer promptInt(String text) {
		System.out.print(text);
		return(sc.nextInt());
	}
	
	public static Boolean promptBool(String text) {
		System.out.print(text);
		return(sc.nextBoolean());
	}
	
	public static Float promptFloat(String text) {
		System.out.print(text);
		return(sc.nextFloat());
	}
	
	public static Double promptDouble(String text) {
		System.out.print(text);
		return(sc.nextDouble());
	}
	
	public static Character promptChar(String text) {
		System.out.print(text);
		return(sc.next().charAt(1));
	}
	
	public static Long promptLong(String text) {
		System.out.print(text);
		return(sc.nextLong());
	}
	
	public static Short promptShort(String text) {
		System.out.print(text);
		return(sc.nextShort());
	}
	
	public static String promptPattern(String text, Pattern pattern) {
		System.out.print(text);
		return(sc.next(pattern));
	}
	
	public static String promptPattern(String text, String pattern) {
		System.out.print(text);
		return(sc.next(pattern));
	}
	
	// print classes
	public static void println(String text) { System.out.println(text); }
	
	public static void print(String text) { System.out.print(text); }
	
	public static void printf(String text, Object args) { System.out.printf(text, args); }
	
	// slow print classes
	public static void slowPrint(String text, Integer millisecondsPerChar, Boolean noNewLine) {
		char chars[] = text.toCharArray();
		for(Integer i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			sleep( millisecondsPerChar);
		}
		if(!noNewLine) System.out.print("\n");
	}
	
	public static void slowPrint(String text, Integer millisecondsPerChar) {
		char chars[] = text.toCharArray();
		for(Integer i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			sleep( millisecondsPerChar);
		}
		System.out.print("\n");
	}
	
	// slow prompt
	public static String slowPrompt(String text, Integer millisecondsPerChar) {
		slowPrint(text, millisecondsPerChar, true);
		return(sc.nextLine());
	}
	
	// sleep
	public static void sleep(Integer length) {
		try {
            Thread.sleep(length);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
}
