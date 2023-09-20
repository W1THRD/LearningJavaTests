package books1to2;
import java.util.Scanner;

public class MathClass {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		// Math Constants
		System.out.println("Pi: " + Math.PI);
		System.out.println("Euler\'s Number: " + Math.E + "\n");
		
		// Area & Circumfrence of a circle
		Float r = Float.parseFloat(prompt("Please enter the radius of your circle: "));
		
		Double a = Math.PI * (r*r);
		Float fa = (float) Math.rint(a*100)/100;
		
		Double c = 2 * Math.PI * r;
		Float fc = (float) Math.rint(c*100)/100;
		System.out.println("Your circle\'s area is: " + fa);
		System.out.println("Your circle\'s cirumfrence is: " + fc + "\n");
		
		// Unary Math Class Functions
		Double num1 = Double.parseDouble(prompt("Insert number 1: "));
		System.out.println("Absolute value: " + (int) Math.abs(num1));
		System.out.println("Square Root: " + Math.sqrt(num1));
		System.out.println("Cube Root: " + Math.cbrt(num1));
		System.out.println("When used as an exponent for: " + Math.exp(num1));
		System.out.println("Natural Logarithm: " + Math.log(num1));
		System.out.println("Base 10 Logarithm: " + Math.log10(num1));
		System.out.println("Number Sign: " + Math.signum(num1));
		System.out.println("Random Number from 0.0 to 1.0: " + Math.random() + "\n");
		
		// Binary Math Class Functions
		Double num2 = Double.parseDouble(prompt("Insert number 2: "));
		System.out.println("Hypotenuse where integers 1 and 2 are opposite and adjacent sides: " + Math.hypot(num1, num2));
		System.out.println("Greatest Number: " + Math.max(num1, num2));
		System.out.println("Least Number: " + Math.min(num1, num2));
		System.out.println("Number 1 to the power of number 2: " + Math.pow(num1, num2) + "\n");
		
		// Crazy Math
		Double num3 = Double.parseDouble(prompt("Insert number 3: "));
		num3 = Math.cbrt(num3);
		System.out.println("Cube Root of number 3: " + num3);
		num3 = Math.sqrt(num3);
		System.out.println("Square root of the Cube Root of number 3: " + num3);
		num3 = Math.pow(num3, num3);
		System.out.println("Square root of the Cube Root of number 3 to the power of it\'s own value: " + num3);
		num3 = Math.log(num3);
		System.out.println("Natural Logarithm of the square root of the Cube Root of number 3 to the power of it\'s own value: " + num3);
		
	}
	public static String prompt(String text) {
		System.out.print(text);
		return(sc.nextLine());
	}
}
