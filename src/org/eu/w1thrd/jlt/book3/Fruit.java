package org.eu.w1thrd.jlt.book3;

public class Fruit {
	protected Boolean isEaten;
	
	public Boolean getIsEaten() { return(isEaten); }
	
	public Fruit(){
		this.isEaten = false;
	}
	
	public void eat() {
		eat("generic fruit", "If only it was a specific type of fruit...");
	}
	
	public void eatCustom(String fruit, String message) {	
		eat(fruit, message);
	}
	
	protected final void eat(String type, String message) {
		if(!this.isEaten) {
			this.isEaten = true;
			IOPlus.println("MMM! What a tasty " + type);
			IOPlus.println(message);
		} else {
			IOPlus.println("NOPE! This " + type + " was already eaten!");
		}
		IOPlus.println("");
	}
	
	
}
