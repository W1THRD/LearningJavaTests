package books1to2;
import java.util.Scanner;

// You won't understand this unless you have played Pizza Tower

public class switch1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		println("Pizza Tower toppins: Mushroom, Cheese, Tomato, Sausage, and Pineapple");
		String input = prompt("What is the best pizza tower toppin? \n").toUpperCase();
		switch(input) {
			case "MUSHROOM": println("Gross!"); break;
			case "CHEESE": println("Melty!"); break;
			case "TOMATO": println("SPLAT!"); break;
			case "SAUSAGE": println("Tasty!"); break;
			case "PINEAPPLE": println("Controversial when put on a pizza!"); break;
			default: println("If only they had " + input + " in Pizza Tower..."); break; 
		}
		
		println("Pizza Tower world 1 levels: John Gutter, Pizzascape, Ancient Cheese, Bloodsauce Dungeon, Pepperman");
		input = prompt("What is the best pizza tower world 1 level? \n").toUpperCase();
		switch(input) {
			case "BLOODSAUCE DUNGEON":
			case "JOHN GUTTER": Resp("Seriously? That one is easy!"); break;
			case "PIZZASCAPE": Resp("You better get to work!"); break;
			case "ANCIENT CHEESE": Resp("Understandable. That one took me forever."); break;
			case "PEPPERMAN": Resp("All I I\'m gonna say is, please don\'t rage quit and break your keyboard, like I did."); break;
			default: println("Either that\'s in a different world, or you are confused."); break;
		}
		
		println("Possible ranks: D, C, B, A, S, P");
		input = prompt("What rank did you get on Oregano Desert? \n").toUpperCase();
		switch(input) {
			case "P": println("YOU ARE AN ABSOLUTE LEGEND AT THIS!");
			case "S": println("You are at least good at this game.");
			case "A": println("You are at least decent at this game.");
			case "B": println("You are at least meh at this game.");
			case "C": println("You are at least bad at this game.");
			case "D": println("You are at minimum VERY bad at this game."); break;
			default: println("Ah yes, the long-lost " + input + "-rank."); break;
		}
		input = prompt("What rank did you get on Wasteyard? \n").toUpperCase();
		switch(input) {
			case "P": rankResp("P"); rankResp("S"); rankResp("A"); rankResp("B"); rankResp("C"); rankResp("D"); break;
			case "S": rankResp("S"); rankResp("A"); rankResp("B"); rankResp("C"); rankResp("D"); break;
			case "A": rankResp("A"); rankResp("B"); rankResp("C"); rankResp("D"); break;
			case "B": rankResp("B"); rankResp("C"); rankResp("D"); break;
			case "C": rankResp("C"); rankResp("D"); break;
			case "D": rankResp("D"); break;
			default: println("Ah yes, the long-lost " + input + "-rank."); break;
		}
		
	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
	public static void Resp(String no) {
		if(prompt("Did you P-rank it? (y/n): ").equalsIgnoreCase("y"))
			println("Good for you!");
		else
			println(no);
	}
	public static void rankResp(String rank) {
		switch(rank) {
		case "P": println("YOU ARE AN ABSOLUTE LEGEND AT THIS!"); break;
		case "S": println("You are at least good at this game."); break;
		case "A": println("You are at least decent at this game."); break;
		case "B": println("You are at least meh at this game."); break;
		case "C": println("You are at least bad at this game."); break;
		case "D": println("You are at minimum VERY bad at this game."); break;
	}
	}
}