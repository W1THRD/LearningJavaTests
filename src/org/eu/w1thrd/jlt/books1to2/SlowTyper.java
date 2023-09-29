package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** An app that uses loops to type slowly */
public class SlowTyper {
static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		slowPrint("Hello!", 100);
		slowPrint("My name is W1THRD!", 100);
		slowPrint("I just barely programmed a slow typer!", 100);
		Integer money = Integer.parseInt(slowPrompt("How many dollars do you have? ", 100));
		slowPrint("LOL, I have " + (money * 2) + " dollars!", 100);
	}
	
	public static String slowPrompt(String text, Integer millisecondsPerChar) {
		slowPrint(text, millisecondsPerChar, true);
		return(sc.nextLine());
	}
	public static void slowPrint(String text, Integer millisecondsPerChar) {
		char chars[] = text.toCharArray();
		for(Integer i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			sleep( millisecondsPerChar);
		}
		System.out.print("\n");
	}
	public static void sleep(Integer length) {
		try {
            Thread.sleep(length);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	public static void slowPrint(String text, Integer millisecondsPerChar, Boolean noNewLine) {
		char chars[] = text.toCharArray();
		for(Integer i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
			sleep( millisecondsPerChar);
		}
		if(!noNewLine) System.out.print("\n");
	}
}
