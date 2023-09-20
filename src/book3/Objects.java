package book3;

public class Objects {
	public static void main(String[] args) {
		IOPlus.println("1. convert an Apple to Object, and then back to Apple");
		Object o = new Apple();
		Apple a = (Apple) o;
		a.eat();
		
		IOPlus.println("2. custom .toString() method");
		Apple b = new Apple();
		IOPlus.println("1st Apple object stringed: " + a.toString());
		IOPlus.println("2nd Apple object stringed: " + b.toString());
		b.eat();
		
		IOPlus.println("3. custom .equals() method");
		IOPlus.println("The two apples are the same: " + a.equals(a) + "\n");
		
		IOPlus.println("4. custom .clone() method");
		Apple c = a.clone();
		IOPlus.println("The og and the clone have the same value: " + a.equals(c));
		IOPlus.println("The og and the clone have the same pointer: " + (a == c) + "\n");
		
		IOPlus.println("4. get object class data");
		Apple d = new Apple();
		String dClass = d.getClass().toString();
		String dSuperClass = d.getClass().getSuperclass().toString();
		IOPlus.println("class: " +dClass);
		IOPlus.println("superclass: " + dSuperClass + "\n");
		
		IOPlus.println("5. Class tree");
		Boolean isAtTop = false;
		@SuppressWarnings("rawtypes")
		Class test = a.getClass();
		while(!isAtTop) {
			try {
				IOPlus.println(test.toString());
				test = test.getSuperclass();
			}catch(NullPointerException exc) {
				isAtTop = true;
			}
		}
	}
}
