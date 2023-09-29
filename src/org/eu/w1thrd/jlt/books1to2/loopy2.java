package org.eu.w1thrd.jlt.books1to2;
import java.util.Scanner;

/** Another test with loops */
public class loopy2 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// basic for loop
		println("Basic for loop");
		for(Integer i = 1; i <= 10; i++) {
			println(i.toString());
		}
		println("\n");
		
		// even number counter
		println("Even for loop");
		for(Integer i = 2; i <= 10; i += 2) {
			println(i.toString());
		}
		println("\n");
		
		// float counter
		println("Float for loop");
		for(Float i = 0.2f; i <= 10.0f; i += 0.2f) {
			println(i.toString());
		}
		println("\n");
		
		// Backwards for loop
		println("Backwards for loop");
		for(Integer i = 10; i >= 1; i--) {
			println(i.toString());
		}
		println("\n");
		
		// Multicount for loop
		println("Multicount for loop");
		Integer a, b;
		for(a = 1, b = -2; (a <= 10) || (b <= 10); a++, b++) {
			println(a + " " + b);
		}
		println("\n");
		
		// ommiting expressions for loop
		println("ommiting expressions for loop");
		for(;;) {
			println("go");
			if(randRange(0, 5) == 1) {
				println("escape");
				break;
			}
		}
		println("\n");
		
		// nested loops
		println("Nested for loops");
		for(Integer x = 0; x <= 30; x++) {
			for(Integer y = 0; y <= 30; y++) {
						println("x = " + x + ", y = " + y);
			}
		}
		
	}
	
	public static void println(String text) { System.out.println(text); }
	public static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}
