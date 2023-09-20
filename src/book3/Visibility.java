package book3;

public class Visibility {
	public static void main (String[] args) {
		Commons.println("This is accessing a different public class!");
		
		Commons.println("Now I will access a private field!");
		Commons.println("Random number: " + randRange(0, 10));
		
		Commons.println("Now I will access a getter and a setter");
		Commons.println("Old value of thing: " + GetterSetter.getThing());
		GetterSetter.setThing(55);
		Commons.println("New value of thing: " + GetterSetter.getThing());
		
		Commons.println("Now I will access an overloaded method");
		Commons.println("\"Fard\" repeated is: " + Overload.repeat("fard"));
		Commons.println("2 repeated is: " + Overload.repeat(2));
		Commons.println("2 repeated and doubled is: " + Overload.repeat(2)*2);
		
		Commons.println("Now here are a few classes that I made!");
		Commons.println("Random Class, gives a random number: " + Random.RandRange(0, 100));
		
		IOPlus.println("Now, let\'s test out a constructor");
		thingy test = new thingy(1);
		test.doFarts();
		
		IOPlus.println("Now, let\'s test out a constructor that calls a different constructor");
		thingy test2 = new thingy(1, true);
		test2.doFarts();
		IOPlus.println("Now, let\'s test out a record");
		IOPlus.println("Pi:" + crappyData.PI);
		
		IOPlus.println("Now, let\'s test out a class that counts how many instances it has");
		InstanceCount thing1 = new InstanceCount();
		IOPlus.println("Create thing1: " + thing1.toString());
		InstanceCount thing2 = new InstanceCount();
		IOPlus.println("Create thing2: " + thing2.toString());
		IOPlus.println("Instance count: " + InstanceCount.getInstanceCount());
		
		IOPlus.println("Here is a Singleton!");
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		IOPlus.println("Inst A and B are the same: " + (a == b));
		
		IOPlus.println("Here is a static init class");
		IOPlus.println("Here is the value of a static init field: " + StaticInit.pubTest);
	}
	
	private static Integer randRange(Integer min, Integer max) {
		Double high = (double) max;
		Double low = (double) min;
		return((int) (Math.random() * (high - low + 1)) + min);
	}
}