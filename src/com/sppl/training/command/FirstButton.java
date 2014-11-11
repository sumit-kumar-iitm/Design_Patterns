package com.sppl.training.command;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class FirstButton extends JButton implements Command {
	
	public FirstButton() {
		super("First");
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "First Button is pressed");
	}

}
