package guidemo;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class MainWindowView extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel lbCounter;
	private JButton btnIncreaseCounter;
	private JButton btnDecreaseCounter;
	private JButton btnResetCounter; // resetButton
	
	
	public JLabel getLbCounter() { return lbCounter; }
	public void setLbCounter(JLabel lbCounter) { this.lbCounter = lbCounter; }

	public JButton getBtnIncreaseCounter() { return btnIncreaseCounter; }
	public void setBtnIncreaseCounter(JButton btnCounter) {	this.btnIncreaseCounter = btnCounter; }
	
	public JButton getBtnDecreaseCounter() { return btnDecreaseCounter; }
	public void setBtnDecreaseCounter(JButton btnDecreaseCounter) {	this.btnDecreaseCounter = btnDecreaseCounter; }

//Button f�r resetCounter
	public JButton getBtnResetCounter() { return btnResetCounter; }
	public void setBtnResetCounter(JButton btnResetCounter) {this.btnResetCounter = btnResetCounter;}

	
	public MainWindowView() {
		super.setTitle("GuiDemo");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(new Dimension(400,200));
		super.setLocationRelativeTo(null);
		
		super.setLayout(new FlowLayout());
		
		this.setLbCounter(new JLabel("0"));
		this.getLbCounter().setFont(new Font("Arial", Font.PLAIN, 24));
		this.setBtnIncreaseCounter(new JButton("Increase"));
		this.setBtnDecreaseCounter(new JButton("Decrease"));
		this.setBtnResetCounter(new JButton("Reset Counter"));
			
		super.add(this.getLbCounter());
		super.add(this.getBtnIncreaseCounter());
		super.add(this.getBtnDecreaseCounter());
		super.add(this.getBtnResetCounter());
		
		super.setVisible(true);
	}
}
