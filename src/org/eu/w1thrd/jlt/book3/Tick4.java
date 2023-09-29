package org.eu.w1thrd.jlt.book3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/** A timer app that uses a Lambda */
public class Tick4 {
	protected static Float tick = 0.0f;
	
	public static void main(String[] args) {
		
		ActionListener a = (ActionEvent e) -> {
			tick += 0.1f;
			IOPlus.println("" + tick);
		};
		Timer t = new Timer(100, a);	
		t.start();
		JOptionPane.showMessageDialog(null, "Click OK to stop the program");
		t.stop();
	}

}
