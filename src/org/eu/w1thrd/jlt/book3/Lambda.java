package org.eu.w1thrd.jlt.book3;

/** A small test with Lambdas and interfaces */
public class Lambda {
	public static void main(String[] args) {
		thing1 test1 = () -> {
			IOPlus.println("aisudgfd89jas");
		};
		
		test1.doThing();
		
		thing2 test2 = (String e) -> {
			IOPlus.println(e + e + e);
		};
		
		test2.doThing("farts");
	}
	
	interface thing1{
		void doThing();
	}
	interface thing2{
		void doThing(String e);
	}
}
