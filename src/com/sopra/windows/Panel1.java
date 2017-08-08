package com.sopra.windows;

import javax.swing.JButton;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel1 extends JPanel {
	
	private JLabel Atout = new JLabel("Atout : ");
	
	private JButton AtoutPique = new JButton("AtoutPique");
	private JButton AtoutCoeur = new JButton("AtoutCoeur");
	private JButton AtoutCarreau = new JButton("AtoutCarreau");
	private JButton AtoutTrefle = new JButton("AtoutTrefle");
	
	public void initialize() {
		this.setLayout(new FlowLayout());
		this.add(Atout);
		this.add(AtoutPique);
		this.add(AtoutCoeur);
		this.add(AtoutTrefle);
		this.add(AtoutCarreau);
	}
	
	public Panel1() {
		this.initialize();
	}
}
