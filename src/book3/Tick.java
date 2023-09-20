package book3;

import javax.swing.*;

public class Tick {
	public static void main(String[] args) {
		Timer t = new Timer(100, new Timekeeper());	
		t.start();
		JOptionPane.showMessageDialog(null, "Click OK to stop the program");
		t.stop();
	}
}
