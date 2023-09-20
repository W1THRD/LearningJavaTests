package books1to2;
public class colorPick {
	public enum color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	public static void main (String[] args) {
		color c1 = color.RED;
		System.out.println("Color is " + c1);
		
		c1 = color.GREEN;
		System.out.println("Color is " + c1);
	}
}
