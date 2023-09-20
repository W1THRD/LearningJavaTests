package books1to2;
import java.util.Scanner;

// Apples Adventure, a Java text-based game by W1THRD

public class LotsOfStuff2 {
	static Scanner sc = new Scanner(System.in);
	static Integer apples = 0;
	static Integer escape = 14;
	static Boolean convict = false;
	static Boolean bigRoom = false;
	static Boolean smallRoom = false;
	static final Integer bigPrice = 6;
	static final Integer smallPrice = 1;
	static Integer roomPrice = 0;
	static Boolean lobby = false;
	static Integer room = 0;
	
	public static void main (String[] args) {
		adventure();
		println("Goodbye now!");
		println("You ended up with " + apples + " apples!");
	}
	
	public static void adventure() {
		apples = Integer.parseInt(prompt("How many apples do you have? \n >"));
		println("You have " + apples + ((apples == 1) ? " apple" : " apples"));
		if(apples == 0) {
			println("Because you have no apples, I will kick you out.");
			return;
		}else if(apples < 0) {
			println("Negative apples means you are in apple debt.");
			println("Because of this, you get thrown in jail for 14 days.");
			if(jail()) return;
			else apples = 0;
		}
		hotel();
		
	}
	
	public static Boolean jail() {
		escape = Integer.parseInt(prompt("How many days until you escape? \n >"));
		if(escape < 0) {
			println("Congrats, you invented a time machine!");
			println("However, the punishment for this is death.");
			return true;
		}else if(escape < 14){
			println("Congrats, you escaped!");
			convict = true;
			return false;
		}else if(escape == 14){
			println("Congrats, you stayed the right amount of time!");
			return false;
		}else {
			println("you is very dumb");
			println("You broke into jail just to stay longer and then escape? RIGHT AFTER you got out of jail?");
			println("Because of lack of IQ, you forgot how to breathe.");
			return true;
		}
	}
	
	public static Boolean hotel() {
		println("It\'s getting late, you need to find a place to stay.");
		println("The local hotel has two rooms: a big one and a small one");
		switch(prompt("Do you want a big room? (Y/n) \n >").toUpperCase()) {
			case "Y":  bigRoom = true; break;
			case "N":  bigRoom = false; break;
			default: println("I\'ll take that as a no..."); bigRoom = false; break;
		}
		switch(prompt("Do you want a small room? (Y/n) \n >").toUpperCase()) {
			case "Y":  smallRoom = true; break;
			case "N":  smallRoom = false; break;
			default: println("I\'ll take that as a yes..."); smallRoom = true; break;
		}
		return(getHotelRoom());
	}
	
	public static Boolean getHotelRoom() {
		if(smallRoom && bigRoom) {
			roomPrice = smallPrice + bigPrice;
			room = 3;
		}else if(smallRoom) {
			roomPrice = smallPrice;
			room = 1;
		}else if(bigRoom) {
			roomPrice = bigPrice;
			room = 2;
		}else {
			room = 0;
		}
		
		if(room != 0) {
			println("Alright, that\'s gonna cost you " + roomPrice + " apples.");
			prompt("Press ENTER to pay");
			if(apples >= roomPrice) {
				println("Good news! You can afford it.");
				prompt("Press ENTER to confirm payment");
				apples -= roomPrice;
				println("You now have " + apples + " apples.");
				println("Goodnight!");
				return(true);
			}else {
				println("Good news! You can afford it.");
				prompt("Press ENTER to confirm payment");
				println("Bad news! You can\'t afford it.");
				apples -= roomPrice;
				println("You now have " + apples + " apples.");
				println("Negative apples means you are in apple debt.");
				println("Because of this, you get thrown in jail for 14 days.");
				
				if(jail()) return false;
				else apples = 0;
			}
		}else {
			println("Because you didn\'t pick a room, you sleep in the hotel lobby.");
			println("You ended up sgetting kicked out, so you slept on a bench outside.");
			println("You were robbed of all your apples by a stranger.");
			apples = 0;
			return(true);
		}
		return(true);
	}

	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	
	public static void println(String text) { System.out.println(text); }
}