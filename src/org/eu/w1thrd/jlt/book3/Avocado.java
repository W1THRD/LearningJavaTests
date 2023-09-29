package org.eu.w1thrd.jlt.book3;

public class Avocado extends Fruit {
	
	public Avocado(){
		this.isEaten = false;
	}
	
	public void eat() {	
		super.eat("avocado", "Gee, I sure am glad that we knew the kind of fruit");
	}

}
