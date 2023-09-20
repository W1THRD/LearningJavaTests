package books1to2;

import java.util.Scanner;
import java.text.NumberFormat;

public class BankAccount {
	static Scanner sc = new Scanner(System.in);
	static NumberFormat MoneyFormat;
	static Float Wallet = (float) randRange(1, 47);
	static Float Balance = 0.00f;
			
	public static void main (String[] args) {
		// Set up number format
		MoneyFormat = NumberFormat.getCurrencyInstance();
		//MoneyFormat.setMaximumFractionDigits(2);
		//MoneyFormat.setMinimumFractionDigits(2);
		
		// Welcome message
		println("Welcome to the bank! \n");
		printBalance(true);
		
		for(;;) {
			String option = prompt("Would you like to Withdraw, Deposit, or Quit? (W/D/Q): ");
			if(option.equalsIgnoreCase("W")) {
				withdraw();
				printBalance(false);
			}else if(option.equalsIgnoreCase("D")) {
				deposit();
				printBalance(false);
			}else if(option.equalsIgnoreCase("Q")) {
				break;
			}else {
				println("That is not an option, please try again. \n");
			}
		
		}
		
		println("Goodbye!");
	}
	
	public static void withdraw() {
		Float amount = Float.parseFloat(prompt("Enter the amount you would like to withdraw: "));
		
		for(;;) {
			if(amount <= Balance) {
				Wallet += amount;
				Balance -= amount;
				break;
			}else {
				println("That is greater than the amount you have in the bank!");
				amount = Float.parseFloat(prompt("Enter the amount you would like to withdraw: "));
			}
		}
	}
	
	public static void deposit() {
		Float amount = Float.parseFloat(prompt("Enter the amount you would like to deposit: "));
		
		for(;;) {
			if(amount <= Wallet) {
				Wallet -= amount;
				Balance += amount;
				break;
			}else {
				println("That is greater than the amount you have in your Wallet!");
				amount = Float.parseFloat(prompt("Enter the amount you would like to withdraw: "));
			}
		}
	}
	
	public static String prompt(String text) {
			System.out.print(text);
			return(sc.nextLine());
	}
	
	public static void printBalance(Boolean firstTime) {
		if(firstTime) {
			println("Current balance: " +  MoneyFormat.format(Balance));
			println("You currently have " + MoneyFormat.format(Wallet) + " in your wallet. \n");
		}else {
			println("New balance: " + MoneyFormat.format(Balance));
			println("You now have " + MoneyFormat.format(Wallet) + " in your wallet. \n");
		}
	}
	
	public static void println(String text) { System.out.println(text); }
	
	public static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}
