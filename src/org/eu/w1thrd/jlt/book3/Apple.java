package org.eu.w1thrd.jlt.book3;

public class Apple extends Fruit implements Cloneable {
	protected static Integer apples = 0;
	protected Integer appleID;
	
	public Apple(){
		this.isEaten = false;
		apples++;
		this.appleID = apples;
	}
	
	public Apple(Boolean isEaten){
		this.isEaten = isEaten;
		apples++;
		this.appleID = apples;
	}
	
	public void eat() {	
		super.eat("apple", "Gee, I sure am glad that we knew the kind of fruit");
	}
	
	public String toString() {
		return("Apple #" + this.appleID + " ( isEaten = " + this.isEaten + " )");
	}
	
	public Boolean equals(Apple a) {
		if(this == a) return true;
		if(a == null) return false;
		if(this.getClass() != a.getClass()) return false;
		if(this.isEaten == a.isEaten) return true;
		else return false;
	}
	
	public Apple clone() {
		return new Apple(this.isEaten);
	}

}
