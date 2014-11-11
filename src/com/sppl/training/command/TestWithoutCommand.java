package com.sppl.training.command;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class FirstFrame extends JFrame{
	private JButton button1, button2;
	
	public FirstFrame() {
		setTitle("Test Frame");
		setSize(200, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("First");
		button2 = new JButton("Second");
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);
		MyActionListener listener = new MyActionListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		add(button1);
		add(button2);
	}
	
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				JOptionPane.showMessageDialog(null, "First Button is pressed");
			}
			else if(e.getSource() == button2) {
				JOptionPane.showMessageDialog(null, "Second Button is pressed");
			}
			
		}
		
	}
}

public class TestWithoutCommand {
	public static void main(String[] args) {
		FirstFrame frame = new FirstFrame();
		frame.setVisible(true);
	}
}
