package book3;

public class Carrot extends Vegetable{
	protected Boolean isEaten;
	
	public Carrot() {
		this.isEaten = false;
	}
	public void eat(){
		if(!this.isEaten) {
			this.isEaten = true;
			IOPlus.println("MMM! What a tasty carrot!");
			IOPlus.println("This carrot extends the abstract class vegetable!");
		} else {
			IOPlus.println("NOPE! This carrot was already eaten!");
		}
		IOPlus.println("");
	}

}
