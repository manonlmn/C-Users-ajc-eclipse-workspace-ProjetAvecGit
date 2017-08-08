package com.sopra.windows;

import java.awt.*;
import javax.swing.*;

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
