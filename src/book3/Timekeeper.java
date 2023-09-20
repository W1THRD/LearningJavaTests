package book3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timekeeper implements ActionListener {
	private Float tick = 0.0f;
	public void actionPerformed(ActionEvent e) {
		tick += 0.1f;
		IOPlus.println("" + tick);
	}
	
}
