// Just an empty starter class
package books1to2;
import java.util.Scanner;

public class empty {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {

	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
}
