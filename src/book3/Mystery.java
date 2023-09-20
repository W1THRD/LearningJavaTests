package book3;

public class Mystery {
	public Fruit fruit;
	public Mystery(){
		if(randRange(1, 2) == 1) {
			this.fruit = new Apple();
		}else {
			this.fruit = new Avocado();
		}
	}
	
	public void eat() {
		this.fruit.eatCustom("mystery fruit", "I wonder what that fruit was...");
	}
	
	private static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}

}
