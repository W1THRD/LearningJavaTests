package org.eu.w1thrd.jlt.book3;

public class Overload {
	public static String repeat(String r) {
		return( r + r );
	}
	public static Integer repeat(Integer r) {
		return(Integer.parseInt(r.toString() + r));
	}
}
