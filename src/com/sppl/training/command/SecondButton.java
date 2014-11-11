package com.sppl.training.command;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class SecondButton extends JButton implements Command {
	
	public SecondButton() {
		super("Second");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Second Button is pressed");
	}

}
