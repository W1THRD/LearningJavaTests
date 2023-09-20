package books1to2;
import java.util.Scanner;

public class colorPick2 {
	public enum color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	public static Scanner sc = new Scanner(System.in);
	public static String Resp = "";
	public static void main (String[] args) {
		System.out.println("Pick a color: ");
		Resp = sc.nextLine();
		color Pick = color.valueOf(Resp);
		System.out.println("Your response was " + Pick);
		if(color.GREEN == color.valueOf(Resp)) {
			System.out.println(Pick + " is the same as " + color.GREEN);
		}else {
			System.out.println(Pick + " is not the same as " + color.GREEN);
		}
	}
}
