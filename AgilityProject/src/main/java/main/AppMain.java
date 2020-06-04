package main;

import Cheval.Cheval;
import designPattern.Adaptateur;
import gestionLivre.Livre;

public class AppMain {
	public static void main(String[] args) {
		Livre livre2 = new Livre("Mon premier titre", 50);
		Cheval cheval = new Cheval (5, 18);
		Adaptateur chevalAuteur = new Adaptateur(cheval);
		chevalAuteur.addLivre(livre2);
		chevalAuteur.saccagerLivres();
	}
}
