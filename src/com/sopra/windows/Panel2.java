package com.sopra.windows;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; 
import java.awt.*;

public class Panel2 extends JPanel {

	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JLabel CartePot = new JLabel("Carte dans le pot : ");
	
	private JLabel Couleur = new JLabel("Couleur : ");
	
	private JButton CouleurPique  = new JButton("Pique");
	private JButton CouleurCoeur = new JButton("Coeur");
	private JButton CouleurCarreau = new JButton("Carreau");
	private JButton CouleurTrefle = new JButton("Trefle");
	
	
	private JLabel Carte = new JLabel("Carte ");
	
	private JButton CarteSept  = new JButton("7");
	private JButton CarteHuit  = new JButton("8");
	private JButton CarteNeuf  = new JButton("9");
	private JButton CarteDix  = new JButton("10");
	private JButton CarteValet  = new JButton("V");
	private JButton CarteDame  = new JButton("D");
	private JButton CarteRoi  = new JButton("R");
	private JButton CarteAs  = new JButton("A");
	
	public void initialize() {
		this.setLayout(new BorderLayout());
		this.add(CartePot, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
		this.add(panel2, BorderLayout.SOUTH);
		
		panel1.setLayout(new GridLayout(1,5));
		panel1.add(Couleur);
		panel1.add(CouleurPique);
		panel1.add(CouleurCoeur);
		panel1.add(CouleurTrefle);
		panel1.add(CouleurCarreau);
		
	}
	
	public Panel2() {
		this.initialize();
	}
}
