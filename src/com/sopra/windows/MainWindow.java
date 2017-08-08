/**
 * 
 */
package com.sopra.windows;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
/**
 * @author ajc
 *
 */
public class MainWindow extends JFrame {

	Panel1 panelHaut= new Panel1();
	Panel2 panelMilieu= new Panel2();
	Panel3 panelBas= new Panel3();
	Panel4 panelGauche= new Panel4();
	private JPanel panelDroit = new JPanel();
	public void initialize() {
		
		this.setLayout(new FlowLayout());
		this.add(this.panelGauche);
		this.add(this.panelDroit);
		this.panelDroit.setLayout(new BorderLayout());
		this.panelDroit.add(this.panelHaut, BorderLayout.NORTH);
		this.panelDroit.add(this.panelMilieu, BorderLayout.CENTER);
		this.panelDroit.add(this.panelBas, BorderLayout.SOUTH);
	}

}
