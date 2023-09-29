package org.eu.w1thrd.jlt.books1to2;

/** Class that tests out some strange incrementing syntax. Not really useful at all */
public class Increment {
	public static void main (String[] args) {
		Integer x = 7;
		Integer y = 5;
		Integer z = 3;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z + "\n");
		
		Integer q = (x++) + (y * z);
		System.out.println("x + 1 = " + x);
		System.out.println("(x++) + (y * z) = " + q + "\n");
		
		x = 7;
		System.out.println("x = " + x);
		Integer v = (++x) + (y * z);
		System.out.println("x + 1 = " + x);
		System.out.println("(++x) + (y * z) = " + v + "\n");
		
		Integer a = 3;
		System.out.println("a = " + a);
		a += 3;
		System.out.println("a += 3 = " + a);
		a -= 10;
		System.out.println("a -= 10 = " + a);
		a *= -5;
		System.out.println("a *= -5 = " + a + "\n");
		
		Integer b;
		Integer c;
		b = (c = 3) * 7;
		System.out.println("(c = 3) * 7 = " + b);
		System.out.println("c = " + c + "\n");
		
		Integer d;
		Integer e;
		Integer f;
		d = e = f = 3;
		System.out.println("d = e = f = " + f);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		System.out.println("f = " + f + "\n");
	}
}
