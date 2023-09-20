package books1to2;
public class chars {
	public static void main(String[] args) {
		Character a = 'a';
		Character b = 'b';
		Character c = 'c';
		
		String cab = Character.toString(c) + Character.toString(a) + Character.toString(b);
		System.out.println(cab);
		
		Character f;
		for (int i = 0; i <= 2000; i++) {
			f = (char) i;
			System.out.println(f);
		}
	}
}
