package org.eu.w1thrd.jlt.book3;

public class StaticInit {
	private static Integer privTest = 5;
	public static Integer pubTest;
	
	static {
		IOPlus.println("StaticInit has been initialized!");
		pubTest = privTest * 5;
	}
}
