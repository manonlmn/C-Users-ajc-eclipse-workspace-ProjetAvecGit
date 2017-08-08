/**
 * 
 */
package com.sopra.windows;

import java.awt.*;
import javax.swing.*;
/**
 * @author ajc
 *
 */
public class MainWindow extends JFrame {

	Panel1 panelHaut= new Panel1(); //ajout automatique des boutons dans panel1 via le constructeur
	Panel2 panelMilieu= new Panel2();
	Panel3 panelBas= new Panel3();
	Panel4 panelGauche= new Panel4();
	private JPanel panelCB = new JPanel(); 
	JCheckBox checkBox = new JCheckBox();
	private JLabel labelCB = new JLabel("Dernier pli gagnant");
	//creation de la checkbox
	private JPanel panelDroit = new JPanel();
	
	
	public void initialize() {
		//ajouter la checkbox au bon endroit
		this.setLayout(new FlowLayout());
		this.add(this.panelGauche);
		this.add(this.panelDroit);
		this.panelDroit.setLayout(new GridLayout(4, 1));
		this.panelDroit.add(this.panelHaut);
		this.panelDroit.add(this.panelMilieu);
		this.panelDroit.add(panelCB);
		this.panelCB.setLayout(new FlowLayout());
		this.panelCB.add(checkBox);
		this.panelCB.add(labelCB);
		this.panelDroit.add(this.panelBas);
		

		//Affichage de la fenêtre
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
