package org.eu.w1thrd.jlt.book3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/** A timer class that uses an anonymous class to work */
public class Tick3 {
	public static void main(String[] args) {
		Timer t = new Timer(100, new ActionListener() {
			private Float tick = 0.0f;
			public void actionPerformed(ActionEvent e) {
				tick += 0.1f;
				IOPlus.println("" + tick);
			}
		});	
		t.start();
		JOptionPane.showMessageDialog(null, "Click OK to stop the program");
		t.stop();
	}

}
