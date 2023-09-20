package books1to2;
import java.util.Scanner;

public class loopy1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		Integer loops = Integer.parseInt(prompt("Number to count to: "));
		Integer count = 0;
		
		while(count < loops) {
			if(prompt("Skip? (Y/N):").equalsIgnoreCase("Y")) {
				continue;
			}
			count++;
			println(count.toString());
			if(prompt("Escape? (Y/N):").equalsIgnoreCase("Y")) {
				break;
			}
		}
		
		println("Done!");
		
		loops = Integer.parseInt(prompt("Times to repeat: "));
		count = 0;
		
		do {
			count++;
			println("HEY!!!!!");
		}while(count < loops);
		
		println("Done!");
		
		Integer c;
		
		do {
			c = Integer.parseInt(prompt("Give me a number less than 5: "));
		}while(c > 5);
		
		println("Done!");
	}
	
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
	public static void println(String text) { System.out.println(text); }
}