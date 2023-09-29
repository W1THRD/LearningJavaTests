package org.eu.w1thrd.jlt.books1to2;

/** Small test with enums */
public class colorPick {
	public enum color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	public static void main (String[] args) {
		color c1 = color.RED;
		System.out.println("Color is " + c1);
		
		c1 = color.GREEN;
		System.out.println("Color is " + c1);
	}
}
