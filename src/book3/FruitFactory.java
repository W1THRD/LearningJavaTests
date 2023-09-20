package book3;

public class FruitFactory {
	public static Fruit getFruit(String f) {
		// return the corresponding type
		if(f.equalsIgnoreCase("fruit")) return new Fruit();
		if(f.equalsIgnoreCase("apple")) return new Apple();
		if(f.equalsIgnoreCase("avocado")) return new Avocado();
		
		// print an error if no match is found
		System.out.println("That\'s not a valid fruit!");
		return(null);
	}
}
