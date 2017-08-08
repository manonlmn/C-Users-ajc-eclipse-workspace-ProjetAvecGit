package com.sopra.windows;

import java.awt.*;
import javax.swing.*;

public class Panel1 extends JPanel {
	
	private JLabel Atout = new JLabel("Atout : ");
	
	private JButton AtoutPique = new JButton("Pique");
	private JButton AtoutCoeur = new JButton("Coeur");
	private JButton AtoutCarreau = new JButton("Carreau");
	private JButton AtoutTrefle = new JButton("Trefle");
	
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
