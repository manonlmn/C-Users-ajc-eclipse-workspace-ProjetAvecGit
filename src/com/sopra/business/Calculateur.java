package com.sopra.business;

import java.util.List;

import com.sopra.model.Carte;

public class Calculateur {
	public int calculScoreManche(List<Carte> listCartes, String atout, boolean dixDeDer) {
		int score = 0;
		
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
			//10
			}
		}
		
		return score;
	}
}
