package de.glamazon.guiprototype.gruppe1.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Color;
import java.awt.Font;
import javax.swing.AbstractListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class Prototype {

	private JFrame frame;
	private JTextField Suchfeld;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototype window = new Prototype();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Prototype() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane, BorderLayout.EAST);
		
		JInternalFrame internalFrame = new JInternalFrame("Glamazon");
		frame.getContentPane().add(internalFrame, BorderLayout.NORTH);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{103, 836, 83, 81, 0};
		gridBagLayout.rowHeights = new int[]{31, 23, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		internalFrame.getContentPane().setLayout(gridBagLayout);
		
		JButton GlamazonLogo = new JButton(new ImageIcon("./assets/pictures/amazon.jpg"));
		GlamazonLogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_GlamazonLogo = new GridBagConstraints();
		gbc_GlamazonLogo.anchor = GridBagConstraints.WEST;
		gbc_GlamazonLogo.insets = new Insets(0, 0, 5, 5);
		gbc_GlamazonLogo.gridx = 0;
		gbc_GlamazonLogo.gridy = 0;
		internalFrame.getContentPane().add(GlamazonLogo, gbc_GlamazonLogo);
		
		Suchfeld = new JTextField();
		GridBagConstraints gbc_Suchfeld = new GridBagConstraints();
		gbc_Suchfeld.fill = GridBagConstraints.HORIZONTAL;
		gbc_Suchfeld.insets = new Insets(0, 0, 5, 5);
		gbc_Suchfeld.gridx = 1;
		gbc_Suchfeld.gridy = 0;
		internalFrame.getContentPane().add(Suchfeld, gbc_Suchfeld);
		Suchfeld.setColumns(10);
		
		JButton Suchbutton = new JButton("Suchen");
		Suchbutton.setForeground(Color.WHITE);
		Suchbutton.setBackground(Color.ORANGE);
		Suchbutton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_Suchbutton = new GridBagConstraints();
		gbc_Suchbutton.anchor = GridBagConstraints.WEST;
		gbc_Suchbutton.fill = GridBagConstraints.VERTICAL;
		gbc_Suchbutton.insets = new Insets(0, 0, 5, 5);
		gbc_Suchbutton.gridx = 2;
		gbc_Suchbutton.gridy = 0;
		internalFrame.getContentPane().add(Suchbutton, gbc_Suchbutton);

		JButton Warenkorbbutton = new JButton("Warenkorb");
		Warenkorbbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		GridBagConstraints gbc_Warenkorbbutton = new GridBagConstraints();
		gbc_Warenkorbbutton.fill = GridBagConstraints.BOTH;
		gbc_Warenkorbbutton.insets = new Insets(0, 0, 5, 0);
		gbc_Warenkorbbutton.gridx = 3;
		gbc_Warenkorbbutton.gridy = 0;
		internalFrame.getContentPane().add(Warenkorbbutton, gbc_Warenkorbbutton);
		
		JToolBar kategorien = new JToolBar();
		GridBagConstraints gbc_kategorien = new GridBagConstraints();
		gbc_kategorien.anchor = GridBagConstraints.NORTH;
		gbc_kategorien.fill = GridBagConstraints.HORIZONTAL;
		gbc_kategorien.gridwidth = 4;
		gbc_kategorien.gridx = 0;
		gbc_kategorien.gridy = 1;
		internalFrame.getContentPane().add(kategorien, gbc_kategorien);
		
		JButton btnNewButton_2 = new JButton("Menü");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kategorien.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Bücher");
		kategorien.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Filme");
		kategorien.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Computer");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kategorien.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Sport");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		kategorien.add(btnNewButton_6);
		
		JTextPane textPane = new JTextPane();
		frame.getContentPane().add(textPane, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{176, 736, 116, 0, 17, 0};
		gbl_panel.rowHeights = new int[]{50, 180, 179, 180, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JFormattedTextField frmtdtxtfldSuchergebnisseFr = new JFormattedTextField();
		frmtdtxtfldSuchergebnisseFr.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmtdtxtfldSuchergebnisseFr.setText("Suchergebnisse f\u00FCr");
		GridBagConstraints gbc_frmtdtxtfldSuchergebnisseFr = new GridBagConstraints();
		gbc_frmtdtxtfldSuchergebnisseFr.anchor = GridBagConstraints.NORTH;
		gbc_frmtdtxtfldSuchergebnisseFr.insets = new Insets(0, 0, 5, 5);
		gbc_frmtdtxtfldSuchergebnisseFr.fill = GridBagConstraints.HORIZONTAL;
		gbc_frmtdtxtfldSuchergebnisseFr.gridx = 0;
		gbc_frmtdtxtfldSuchergebnisseFr.gridy = 0;
		panel.add(frmtdtxtfldSuchergebnisseFr, gbc_frmtdtxtfldSuchergebnisseFr);
		
		JLabel lblNewLabel_1 = new JLabel(new ImageIcon("./assets/pictures/buch.jpg"));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel_1.setForeground(Color.ORANGE);
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JFormattedTextField Kurzbeschreibung1_formattedTextField = new JFormattedTextField("Kurzbeschreibung");
		GridBagConstraints gbc_Kurzbeschreibung1_formattedTextField = new GridBagConstraints();
		gbc_Kurzbeschreibung1_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_Kurzbeschreibung1_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_Kurzbeschreibung1_formattedTextField.gridx = 1;
		gbc_Kurzbeschreibung1_formattedTextField.gridy = 1;
		panel.add(Kurzbeschreibung1_formattedTextField, gbc_Kurzbeschreibung1_formattedTextField);
		
		JButton btnNewButton = new JButton("In den Warenkorb");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 1;
		panel.add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel(new ImageIcon("./assets/pictures/film.jpg"));
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JFormattedTextField Kurzbeschreibung2_formattedTextField = new JFormattedTextField("Kurzbeschreibung");
		GridBagConstraints gbc_Kurzbeschreibung2_formattedTextField = new GridBagConstraints();
		gbc_Kurzbeschreibung2_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_Kurzbeschreibung2_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_Kurzbeschreibung2_formattedTextField.gridx = 1;
		gbc_Kurzbeschreibung2_formattedTextField.gridy = 2;
		panel.add(Kurzbeschreibung2_formattedTextField, gbc_Kurzbeschreibung2_formattedTextField);
		
		JButton btnNewButton_1 = new JButton("In den Warenkorb");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.RED);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 2;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel(new ImageIcon("./assets/pictures/laptop.jpg"));
		lblNewLabel_2_1.setForeground(Color.ORANGE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GridBagConstraints gbc_lblNewLabel_2_1 = new GridBagConstraints();
		gbc_lblNewLabel_2_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblNewLabel_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_lblNewLabel_2_1.gridx = 0;
		gbc_lblNewLabel_2_1.gridy = 3;
		panel.add(lblNewLabel_2_1, gbc_lblNewLabel_2_1);
		internalFrame.setVisible(true);
		
		JScrollBar scrollBar = new JScrollBar();
		GridBagConstraints gbc_scrollBar = new GridBagConstraints();
		gbc_scrollBar.anchor = GridBagConstraints.WEST;
		gbc_scrollBar.fill = GridBagConstraints.VERTICAL;
		gbc_scrollBar.gridheight = 3;
		gbc_scrollBar.gridx = 4;
		gbc_scrollBar.gridy = 1;
		panel.add(scrollBar, gbc_scrollBar);
		
		JFormattedTextField Kurzbeschreibung3_formattedTextField = new JFormattedTextField("Kurzbeschreibung");
		GridBagConstraints gbc_Kurzbeschreibung3_formattedTextField = new GridBagConstraints();
		gbc_Kurzbeschreibung3_formattedTextField.insets = new Insets(0, 0, 0, 5);
		gbc_Kurzbeschreibung3_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_Kurzbeschreibung3_formattedTextField.gridx = 1;
		gbc_Kurzbeschreibung3_formattedTextField.gridy = 3;
		panel.add(Kurzbeschreibung3_formattedTextField, gbc_Kurzbeschreibung3_formattedTextField);
		
		JButton btnNewButton_1_1 = new JButton("In den Warenkorb");
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBackground(Color.RED);
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1_1.gridx = 2;
		gbc_btnNewButton_1_1.gridy = 3;
		panel.add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.gridheight = 4;
		gbc_scrollPane_1.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 3;
		gbc_scrollPane_1.gridy = 0;
		panel.add(scrollPane_1, gbc_scrollPane_1);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
