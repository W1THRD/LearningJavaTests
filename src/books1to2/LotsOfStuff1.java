package books1to2;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;

public class LotsOfStuff1 {
	static Scanner scan = new Scanner(System.in);
	enum fruit { APPLE, ORANGE, BANANA, PINEAPPLE, BLUEBERRY }
	
	public static void main (String[] args) {
		System.out.print("What part do you want to start in? (1/2): ");
		Integer startPart = Integer.parseInt(scan.nextLine());
		if(startPart == 1) {
			part1();
			part2();
		}else if(startPart == 2) {
			part2();
		}else {
			System.err.println("That's not an option!");
			System.err.println("Goodbye!");
		}
	}
	
	public static void pause() {
		System.out.println("Press ENTER to Continue");
		scan.nextLine();
	}
	
	public static void part1() {
		System.out.println("Welcome to this app!");
		System.out.println("It is a combination of all the thing I have learned so far from my Java programming book.");
		pause();
		
		System.out.println("First, we Characters.");
		System.out.print("Enter a Character and press Enter: ");
		Character char0 = scan.nextLine().charAt(0);
		System.out.println("You typed: " + char0);
		System.out.println("That is Character number " + char0.hashCode());
		System.out.println("Whitespace: " + Character.isWhitespace(char0));
		pause();
		
		System.out.println("Second, we have Integers.");
		System.out.print("Enter an Integer and press Enter: ");
		Integer int0 = Integer.parseInt(scan.nextLine());
		System.out.println("You typed: " + int0);
		System.out.println("Your number doubled is: " + (int0*2));
		System.out.println("Your number squared is: " + (int0*int0));
		System.out.println("Your number plus 2,763 is: " + (int0+2763));
		System.out.println("The bytes of it reversed is: " + Integer.reverse(int0));
		pause();
		
		System.out.println("Third, we have Longs");
		System.out.print("Enter a Long and press Enter: ");
		Long long0 = Long.parseLong(scan.nextLine());
		System.out.println("You typed: " + long0);
		System.out.println("Your number doubled is: " + (long0*2));
		pause();
		
		System.out.println("Fourth, we have Shorts");
		System.out.print("Enter a Long and press Enter: ");
		Short short0 = Short.parseShort(scan.nextLine());
		System.out.println("You typed: " + short0);
		System.out.println("Your number doubled is: " + (short0*2));
		pause();
		
		System.out.println("Fifth, we have Bytes");
		System.out.print("Enter a Byte and press Enter: ");
		Byte byte0 = Byte.parseByte(scan.nextLine());
		System.out.println("You typed: " + byte0);
		System.out.println("Your number doubled is: " + (byte0*2));
		pause();
		
		System.out.println("Sixth, we have Floats");
		System.out.print("Enter a Float and press Enter: ");
		Float float0 = Float.parseFloat(scan.nextLine());
		System.out.println("You typed: " + float0);
		System.out.println("Your number doubled is: " + (float0*2.0f));
		System.out.println("Your number rounded is: " + Math.round(float0));
		pause();
		
		System.out.println("Seventh, we have Doubles");
		System.out.print("Enter a Double and press Enter: ");
		Double double0 = Double.parseDouble(scan.nextLine());
		System.out.println("You typed: " + double0);
		System.out.println("Your number doubled is: " + (double0*2.0f));
		System.out.println("Your number rounded is: " + Math.round(double0));
		pause();
		
		System.out.println("That\'s all for data types and console I\\O");
		System.out.println("Let\'s now do some GUI!!!");
		pause();
	}
	
	public static void part2() {
		JOptionPane.showMessageDialog(null, "Wow! We are now in the graphical world!");
		JOptionPane.showMessageDialog(null, "The fruits are APPLE, ORANGE, BANANA, PINEAPPLE, and BLUEBERRY");
		fruit choice = fruit.valueOf(JOptionPane.showInputDialog("Pick a fruit (case sensitive): "));
		JOptionPane.showMessageDialog(null, "Your fruit was " + choice);
		if(fruit.APPLE == choice) {
			JOptionPane.showMessageDialog(null, "Because you picked APPLE, the annoying orange will annoy you for all of eternity");
		}else if(fruit.ORANGE == choice) {
			JOptionPane.showMessageDialog(null, "Because you picked ORANGE, you will become the annoying orange");
		}else if(fruit.BANANA == choice) {
			JOptionPane.showMessageDialog(null, "Because you picked BANANA, Bomby from BFDI will eat you");
		}else if(fruit.PINEAPPLE == choice) {
			JOptionPane.showMessageDialog(null, "Because you picked PINEAPPLE, you will be hated by millions every time you are on a pizza");
		}else if(fruit.BLUEBERRY == choice) {
			JOptionPane.showMessageDialog(null, "Because you picked BLUEBERRY, you will turn into Blueberry from Inanimate Insanity");
		}
		
		JOptionPane.showMessageDialog(null, "That\'s all for now, folks!");
	}
}
