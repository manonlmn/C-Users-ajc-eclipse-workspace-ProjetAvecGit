package com.sopra.business;

import java.util.List;

import com.sopra.model.Carte;

public class Calculateur {
	public int calculScoreManche(List<Carte> listCartes, String atout, boolean dixDeDer) {
		// Initialisé à 10 si Dix de Der, 0 sinon
		int score = dixDeDer?10:0;

		// Parcours des cartes pour calculer leur valeur
		for (Carte carte : listCartes) {
			switch (carte.getValeur()) {
			// 9
			case 2:
				// Atout
				if (carte.getSigne().equals(atout)) {
					score += 14;
				}
				// Pas atout
				else {
					score += 0;
				}
				break;

			// 10
			case 3:
				score += 10;
				break;

			// V
			case 4:
				// Atout
				if (carte.getSigne().equals(atout)) {
					score += 20;
				}
				// Pas atout
				else {
					score += 2;
				}
				break;
				
			// D
			case 5: score += 3; break;
				
			// R
			case 6: score += 4; break;
				
			// A
			case 7: score += 11; break;
				
			// Autres cartes
			default : score += 0; break;
			}
		}

		return score;
	}
}
