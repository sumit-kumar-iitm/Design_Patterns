package com.sppl.training.command;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Invoker implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Command command = (Command)e.getSource();
		command.execute();
	}

}
