package com.sopra.windows;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel3 extends JPanel {

	
	private JLabel CheckBox = new JLabel("10 de der."); 
	private JCheckBox checkBox = new JCheckBox();
	
	private JButton BoutonAjouter = new JButton("Ajouter");
	private JButton BoutonReset = new JButton("Reset");
	private JButton BoutonCalcul = new JButton("Calcul");
	
	public void initialize() {
		this.setLayout(new FlowLayout());
		this.add(CheckBox);
		this.add(checkBox);
		this.add(BoutonAjouter);
		this.add(BoutonReset);
		this.add(BoutonCalcul);
	}
	
	public Panel3() {
		this.initialize();
	}
	
}
