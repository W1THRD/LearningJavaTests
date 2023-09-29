package org.eu.w1thrd.jlt.book3;

public interface Pittable {
	
	void pit();
	void eat();
	
	default void explode() {
		IOPlus.println("KABOOOM!!!");
	}
}
