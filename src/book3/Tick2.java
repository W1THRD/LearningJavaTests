package book3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tick2 {
	public static void main(String[] args) {
		Timer t = new Timer(100, new Timekeeper2());	
		t.start();
		JOptionPane.showMessageDialog(null, "Click OK to stop the program");
		t.stop();
	}
	
	static class Timekeeper2 implements ActionListener {
		private Float tick = 0.0f;
		public void actionPerformed(ActionEvent e) {
			tick += 0.1f;
			IOPlus.println("" + tick);
		}
		
	}
}
