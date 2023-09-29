package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** A game where you try to guess a number from 1 to 10 */
public class GuessingGame {
	static Scanner sc = new Scanner(System.in);
	static Boolean stillPlay;
	static Boolean incorrect;
	public static void main (String[] args) {
		
		Integer randNum = 0;
		Integer response = 0;
		stillPlay = true;
		incorrect = false;
		println("I\'m thinking of a random number from 1 to 10, and you have to guess what it is.");
		
		do {
			// set up data
			randNum = randRange(1, 10);
			
			// get input
			try {
				response = Integer.parseInt(prompt("Enter your guess: "));
				if(response < 1 || response > 10) throw new Exception();
			}catch(Exception e) {
				incorrect = true;
				println("Hey! That\'s not allowed!");
				continue;
			}
			incorrect = false;
			
			// interpret input
			if(randNum == response) { println("Correct!"); }
			else { println("Incorrect!"); }
			System.out.print("Would you like to play again? ");
			switch(sc.nextLine().toUpperCase()){
				case "N": stillPlay = false; break;
				case "Y": stillPlay = true; break;
				default: println("I\'ll take that as a no..."); stillPlay = false; break;
			}
		}while(stillPlay | incorrect);
		
		println("Goodbye!");
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
