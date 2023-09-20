
package books1to2;
import javax.swing.JOptionPane;

public class colorPick3 {
	enum color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
	static String Resp = "";
	public static void main (String[] args) {
		Resp = JOptionPane.showInputDialog("Pick a color");
		color Pick = color.valueOf(Resp);
		JOptionPane.showMessageDialog(null, "Your response was " + Pick);
		if(color.GREEN == color.valueOf(Resp)) {
			JOptionPane.showMessageDialog(null, Pick + " is the same as " + color.GREEN);
		}else {
			JOptionPane.showMessageDialog(null, Pick + " is not the same as " + color.GREEN);
		}
	}
}
