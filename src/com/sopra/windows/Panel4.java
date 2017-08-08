package com.sopra.windows;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel4 extends JPanel {

	private JLabel ListeScores = new JLabel("Liste des Scores"); 
	
	public void initialize() {
		this.setLayout(new FlowLayout());
		this.add(ListeScores);
	}
	
	public Panel4() {
		this.initialize();
	}
}
