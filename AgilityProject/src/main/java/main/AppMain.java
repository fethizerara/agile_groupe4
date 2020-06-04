package main;

import java.util.ArrayList;
import java.util.List;

import Cheval.Cheval;
import designPattern.Adaptateur;
import designPattern.LivreFactory;
import designPattern.LivreFactory1;
import gestionLivre.Auteur;
import gestionLivre.Livre;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivreFactory factory1 = new LivreFactory1();
		Cheval cheval1 = new Cheval();
		Livre livre = factory1.ecrireLivre();
		//Création d'un livre par un cheval 
		
		List<Livre> listeLivre = new ArrayList<Livre>();
		
		listeLivre.add(livre);
		cheval1.setListeLivreEcrit(listeLivre);
		
		for (Livre liv : cheval1.getListeLivreEcrit()) {
			System.out.println(liv.getPrix());
		}
		
		Livre livre2 = new Livre("Mon premier titre", 50);
		Cheval cheval = new Cheval (5, 18);
		Adaptateur chevalAuteur = new Adaptateur(cheval);
		chevalAuteur.addLivre(livre2);
		chevalAuteur.saccagerLivres();
		

	}

}
