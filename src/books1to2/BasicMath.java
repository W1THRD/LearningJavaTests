package books1to2;

import java.util.Scanner;

public class BasicMath {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		System.out.print("Enter a number: ");
		Integer num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("Enter another number: ");
		Integer num2 = Integer.parseInt(sc.nextLine());
		
		Integer num3 = num1 + num2;
		System.out.println(num1 + " plus " + num2 + " equals " + num3);
		
		Integer num4 = num1 - num2;
		System.out.println(num1 + " minus " + num2 + " equals " + num4);
		
		Integer num5 = num1 * num2;
		System.out.println(num1 + " times " + num2 + " equals " + num5);
		
		System.out.println("\n Time to do some simple division!");
		System.out.print("Enter first input: ");
		Integer num6 = Integer.parseInt(sc.nextLine());
		System.out.print("Enter second input: ");
		Integer num7 = Integer.parseInt(sc.nextLine());
		Integer num8 = num6 / num7;
		Integer num9 = num6 % num7;
		System.out.println("And the result is: " + num8);
		System.out.println("The remainder is: " + num9);
		
		System.out.println("\n Time to do some precise division!");
		System.out.print("Enter first input: ");
		Float num10 = Float.parseFloat(sc.nextLine());
		System.out.print("Enter second input: ");
		Float num11 = Float.parseFloat(sc.nextLine());
		Float num12 = num10 / num11;
		System.out.println("And the result is: " + num12);
		
		System.out.print("Enter a temperature in Fahrenheit: ");
		Float num13 = Float.parseFloat(sc.nextLine());
		Float num14 = convert(num13);
		System.out.print(num13 + "°F is equal to " + num14 + "°C");
	}
	
	public static Float convert(Float f) {
		return((f - 32.0f) * (5.0f / 9.0f));
	}
}
