package org.eu.w1thrd.jlt.books1to2;

/** Basic math operators test */
public class inttest {
	public static int a = 3;
	public static int b = 5;
	
	public static void main(String[] args)
	{
		int c = a + b;
		System.out.println(Integer.toString(a) + " + " + Integer.toString(b) + " = " + Integer.toString(c));
		
		int d = a - b;
		System.out.println(Integer.toString(a) + " - " + Integer.toString(b) + " = " + Integer.toString(d));
		
		int e = a * b;
		System.out.println(Integer.toString(a) + " x " + Integer.toString(b) + " = " + Integer.toString(e));
		
		float f = (float) a / (float) b;
		System.out.println(Integer.toString(a) + " / " + Integer.toString(b) + " = " + Float.toString(f));
	}
}
