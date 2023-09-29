package org.eu.w1thrd.jlt.book3;

public class Random {
	public static Integer RandRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}
