package main;

import Cheval.Box;
import Cheval.Cheval;
import designPattern.Adaptateur;
import designPattern.HorseLibrary;
import gestionLivre.Livre;

public class AppMain {
	public static void main(String[] args) {
		
		
		Livre livre2 = new Livre("Mon premier titre", 50);
		Cheval cheval = new Cheval (5, 18);
		
		System.out.println("Adapter");
		Adaptateur chevalAuteur = new Adaptateur(cheval);
		chevalAuteur.addLivre(livre2);
		chevalAuteur.saccagerLivres();
		
		
		System.out.println("*******");
		System.out.println("Sengloton");
		HorseLibrary l1 = new HorseLibrary ();
		l1.getInstance();
		
		HorseLibrary l2 = new HorseLibrary ();
		l2.getInstance();
		
		HorseLibrary l3 = new HorseLibrary ();
		l3.getInstance();
		
		
	}
}
