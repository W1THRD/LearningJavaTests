package book3;

public class EatingSim {
	static Fruit fruit = new Fruit();
	static Apple apple = new Apple();
	static Vegetable celery = getCelery();
	static Fruit orange = getOrange();
	static Fruit fruitApple = new Apple();
	static Mystery mystery = new Mystery();
	static Carrot carrot = new Carrot();
	static EdiblePittable cherry = new Cherry();
	static Pear pear = new Pear();
	
	public static void main(String[] args) {
		IOPlus.println("Welcome to Eating Simulator!!!");
		IOPlus.println("Say \"list\" for a list of foods, and \"exit\" to exit the program. \n");
		for(;;) {
			if(!pickFood()) break;
		}
		IOPlus.println("Goodbye!");
		
	}
	
	public static Boolean pickFood(){
		String command = IOPlus.promptString("Enter your eating command here: ");
		switch(command.toLowerCase()) {
			case "fruit": fruit.eat(); break;
			case "fruit apple": fruitApple.eat(); break;
			case "celery": celery.eat(); break;
			case "apple": apple.eat(); break;
			case "orange": orange.eat(); break;
			case "pear": pear.eat(); break;
			case "cherry": cherry.eat(); break;
			case "cherry explode": cherry.explode(); break;
			case "cherry pit": cherry.pit(); break;
			case "carrot": carrot.eat(); break;
			case "nothing": try{ throw new HungerException(); }
							catch(HungerException e) { e.printStackTrace(); } break;
			case "mystery": mystery.eat(); break;
			case "ffactory": eatFactoryFruit(); break;
			case "vfactory": eatFactoryVegetable(); break;
			case "list": listCommands(); break;
			case "exit": return(false);
		}
		
		return(true);
	}
	
	public static void listCommands() {
		IOPlus.println("\nfruit - eat a generic fruit");
		IOPlus.println("fruit apple - eat an apple, casted to fruit type");
		IOPlus.println("apple - eat an apple");
		IOPlus.println("celery - eat a celery");
		IOPlus.println("orange - eat an orange");
		IOPlus.println("pear - eat an apple");
		IOPlus.println("cherry - eat a cherry");
		IOPlus.println("cherry explode - explode a cherry (they are explosive)");
		IOPlus.println("cherry pit - get the pit of a cherry");
		IOPlus.println("nothing - eat nothing");
		IOPlus.println("ffactory - create a new fruit and eat it (fruit, apple, or avocado)");
		IOPlus.println("vfactory - create a new veggie and eat it (carrot)");
		IOPlus.println("mystery - eat a random fruit, either an avocado or an apple");
		IOPlus.println("list - print this help text");
		IOPlus.println("exit - exit the program\n");
	}
	
	public static void eatFactoryFruit() {
		Fruit fruit = FruitFactory.getFruit(IOPlus.promptString("Enter food type: "));
		if(!fruit.equals(null)) {
			fruit.eat();
		}
	}
	
	public static void eatFactoryVegetable() {
		V v;
		switch(IOPlus.promptString("Enter food type: ").toLowerCase()) {
			case "carrot": v = V.CARROT; break;
			default: v = null;
		}
		Vegetable veggie = VegetableFactory.getVegetable(v);
		
		if(veggie != null) {
			veggie.eat();
		}
	}
	
	public static Fruit getOrange() {
		Fruit orange = new Fruit() {
			@SuppressWarnings("unused")
			Boolean isEaten = false;
			
			public void eat() {	
				super.eat("orange", "Gee, I sure am glad that we knew the kind of fruit");
			}
		};
		
		return(orange);
	}
	
	public static Vegetable getCelery() {
		Vegetable celery = new Vegetable() {
			protected Boolean isEaten = false;

			public void eat(){
				if(!this.isEaten) {
					this.isEaten = true;
					IOPlus.println("MMM! What a tasty celery!");
					IOPlus.println("This celery extends the abstract class vegetable! And is also an anonymous class!");
				} else {
					IOPlus.println("NOPE! This celery was already eaten!");
				}
				IOPlus.println("");
			}
		};
		
		return(celery);
	}
	
	static class Pear extends Fruit implements Cloneable {
		protected static Integer pears = 0;
		protected Integer pearID;
		
		public Pear(){
			this.isEaten = false;
			pears++;
			this.pearID = pears;
		}
		
		public Pear(Boolean isEaten){
			this.isEaten = isEaten;
			pears++;
			this.pearID = pears;
		}
		
		public void eat() {	
			super.eat("pear", "Gee, I sure am glad that we knew the kind of fruit");
		}
		
		public String toString() {
			return("Pear #" + this.pearID + " ( isEaten = " + this.isEaten + " )");
		}
		
		public Boolean equals(Pear a) {
			if(this == a) return true;
			if(a == null) return false;
			if(this.getClass() != a.getClass()) return false;
			if(this.isEaten == a.isEaten) return true;
			else return false;
		}
		
		public Pear clone() {
			return new Pear(this.isEaten);
		}

	}

}
