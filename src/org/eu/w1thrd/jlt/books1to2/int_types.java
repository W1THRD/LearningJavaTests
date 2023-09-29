package org.eu.w1thrd.jlt.books1to2;

/** A class that does operations with Integers, Bytes, Longs, Shorts, Doubles, and Floats */
public class int_types {
	static final int FART_COUNT = 123;
	static int ham = 22340;
	
	public static void main (String[] args) {
		Integer a = 214748;
		System.out.println(Integer.toString(a));
		Byte b = 126;
		System.out.println(Byte.toString(b));
		Short c = 3276;
		System.out.println(Short.toString(c));
		Long d = 9223372036854775l;
		System.out.println(Long.toString(d));
		Float e = 1.4456f;
		System.out.println(Float.toString(e));
		Double f = 1e-70;
		System.out.println(Double.toString(f));
		
		System.out.println(Double.toString(f + e));
		
		System.out.println(Float.toString(e + b));
		System.out.println(Float.toString(e + a));
		System.out.println(Integer.toString(FART_COUNT));
		System.out.println(Integer.toString(FART_COUNT));
		
		String z = "33";
		Integer y = Integer.parseInt(z);
		String x = Integer.toString(y);
		System.out.println(x);
	}
}
