package books1to2;

import java.util.Scanner;

public class BiggerSmallerGame {
static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// Initialize Variables
		Boolean isCorrect = false;
		Integer randNum = randRange(1, 100);
		Integer guessedNum;
		Integer steps = 1;
		
		// Game Loop
		println("I\'m thinking of a random number from 1 to 100, and you have to guess what it is.");
		do {
			guessedNum = Integer.parseInt(prompt("Enter your guess: "));
			if(inRange(guessedNum, 1, 100)) {
				if(guessedNum < randNum) {
					isCorrect = false;
					println("My number is bigger than that!");
				}else if(guessedNum > randNum) {
					isCorrect = false;
					println("My number is smaller than that!");
				}else if(guessedNum == randNum) {
					isCorrect = true;
					println("Correct! My number was " + randNum);
					println("You guessed correctly in " + steps + " steps!");
				}
			}else {
				isCorrect = false;
				println("That\'s not in range!");
			}
			
			steps++;
		}while(!isCorrect);
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
	public static Boolean inRange(Integer input, Integer low, Integer high) {
		return(input >= low && input <= high);
	}
}
