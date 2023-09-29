package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** Small conversation with a computer, uses if-else statements */
public class conversation {
	static Scanner sc = new Scanner(System.in);
	static String Resp = "";
	static Boolean badDay;
	
	public static void main (String[] args) {
		System.out.println("Has your day been good? (true/false)");
		Resp = sc.nextLine();
		if(Boolean.parseBoolean(Resp)) {
			System.out.println("Good for You!");
			badDay = false;
		} else{
			System.out.println("Oh no!");
			badDay = true;
		} 
		if(badDay) {
			System.out.println("I hope you have a better day tomorrow!");
		}
		System.out.println("Goodbye!");
	}
}

