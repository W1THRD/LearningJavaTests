package book3;

public class VegetableFactory {
	
	public static Vegetable getVegetable(V f) {
		// return the corresponding type
		try{
			if(f.equals(V.CARROT)) return new Carrot();
		}catch(Exception e) {
			System.out.println("That\'s not a valid veggie!");
		}
		
		return null;
	}
}
