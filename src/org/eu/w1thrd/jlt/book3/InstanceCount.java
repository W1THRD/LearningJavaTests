package org.eu.w1thrd.jlt.book3;

public class InstanceCount {
	private static Integer instanceCount = 0;
	
	public static Integer getInstanceCount() { return(instanceCount); }
	
	public InstanceCount() {
		instanceCount++;
	}
}
