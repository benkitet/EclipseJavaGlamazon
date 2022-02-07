package de.glamazon.guiprototype.gruppe1.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	
	public MainFrame() {
	
	this.setBounds(100, 100, 1200, 800);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.getContentPane().setLayout(new BorderLayout(0, 0));
	}
}
