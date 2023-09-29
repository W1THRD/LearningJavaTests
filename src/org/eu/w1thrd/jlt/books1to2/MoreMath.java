package org.eu.w1thrd.jlt.books1to2;

/** Tests with simple math operations */
public class MoreMath {
	public static void main (String[] args) {
		Integer num1 = 7;
		System.out.println(num1);
		num1++;
		System.out.println(num1 + "\n"); // 8
		
		Integer num2 = 9;
		System.out.println(num2);
		num2--;
		System.out.println(num2 + "\n"); // 8
		
		Integer num3 = 5;
		System.out.println(num3);
		num3 = -num3;
		System.out.println(num3 + "\n"); // -5
		
		Integer num4 = -5;
		System.out.println(num4);
		num4 = -num4;
		System.out.println(num4 + "\n"); // 5
		
		Integer num5 = 6;
		Integer num6 = 6;
		System.out.println(num5);
		System.out.println(num6);
		num5 = -num5;
		num6 += num5;
		System.out.println(num6 + "\n"); // 0
	}
}
