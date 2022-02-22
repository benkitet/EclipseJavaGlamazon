package de.glamazon.guiprototype.gruppe1.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1L;

	public MainFrame() {
	super.setTitle("GuiPrototyp");
	super.setBounds(100, 100, 1200, 800);
	super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	super.getContentPane().setLayout(new BorderLayout(0, 0));
	}
}
