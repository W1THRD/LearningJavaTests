package books1to2;
import javax.swing.JOptionPane;
public class inputPane {
	static String options;
	
	public static void main (String[] args) {
		options = JOptionPane.showInputDialog("GIVE ME NUMBERS!!!!!");
		Integer x = Integer.parseInt(options);
		JOptionPane.showMessageDialog(null, "A better number is: " + (x * x));
	}
}
