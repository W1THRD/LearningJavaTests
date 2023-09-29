package org.eu.w1thrd.jlt.book3;

public class Cherry extends Fruit implements EdiblePittable{
	protected Boolean isPitted;
	
	public void pit() {
		if(!this.isEaten) {
			IOPlus.println("Eat the fruit BEFORE pitting it!");
		}else if(!isPitted) {
			IOPlus.println("ptoo! you spit it out.");
			this.isPitted = true;
		}else{
			IOPlus.println("The pit is gone!");
		}
			
		
		IOPlus.println("");
	}
	
	public Cherry(){
		this.isEaten = false;
		this.isPitted = false;
	}
	
	public void eat() {	
		IOPlus.println("Random number constant: " + randomNum);
		super.eat("cherry", "That cherry implements pittable!");
	}
	
}
