package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;
import java.text.NumberFormat;

/** Rounding and number formatting tests */
public class RoundAndFormat {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		println("Welcome to number rounder and formatter!");
		Float userBalance = Float.parseFloat(prompt("Enter your number: "));
		Float myBalance = (float) randRange(1, 47);
		Boolean isMoney = false;
		NumberFormat finalNum;
		
		if(prompt("Would you like to round this number? (Y/N): ").equalsIgnoreCase("y")) {
			String rfc = prompt("Round, Floor, or Ceil? (R/F/C):  ");
			if(rfc.equalsIgnoreCase("r")) {
				userBalance = (float) Math.round(userBalance);
			}else if(rfc.equalsIgnoreCase("f")) {
				userBalance = (float) Math.floor(userBalance);
			}else if(rfc.equalsIgnoreCase("c")) {
				userBalance = (float) Math.ceil(userBalance);
			}
		}
		
		if(prompt("Would you like to format this number? (Y/N): ").equalsIgnoreCase("y")) {
			String cpn = prompt("Currency, Percentage, or Number? (C/P/N):  ");
			if(cpn.equalsIgnoreCase("c")) {
				isMoney = true;
				finalNum = NumberFormat.getCurrencyInstance();
			}else if(cpn.equalsIgnoreCase("p")) {
				finalNum = NumberFormat.getPercentInstance();
			}else if(cpn.equalsIgnoreCase("n")) {
				finalNum = NumberFormat.getNumberInstance();
			}else {
				finalNum = NumberFormat.getNumberInstance();
			}
			
			println("The final result is: " + finalNum.format(userBalance));
			if(isMoney) {
				println("I have " + finalNum.format(myBalance));
				if(userBalance > myBalance) {
					println("You have " + finalNum.format(userBalance - myBalance) + " more than me");
				}else if(userBalance < myBalance) {
					println("I have " + finalNum.format(myBalance - userBalance) + " more than you");
				}
			}
			
		}else {
			println("The final result is: " + userBalance);
		}
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
