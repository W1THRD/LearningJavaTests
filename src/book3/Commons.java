package book3;

import java.util.Scanner;

public class Commons {
	private static Scanner sc = new Scanner(System.in);
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
}
