package com.sppl.training.command;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class SecondFrame extends JFrame{
	private JButton button1, button2;
	
	public SecondFrame() {
		setTitle("Test Frame");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new FirstButton();
		button2 = new SecondButton();
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		Invoker invoker = new Invoker();
		button1.addActionListener(invoker);
		button2.addActionListener(invoker);
		
		add(button1);
		add(button2);
	}
}

public class TestWithCommand {
	public static void main(String[] args) {
		SecondFrame frame = new SecondFrame();
		frame.setVisible(true);
	}
}
