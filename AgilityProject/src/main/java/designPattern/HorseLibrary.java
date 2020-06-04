package designPattern;

import java.util.ArrayList;

import Cheval.Cheval;
import gestionLivre.Livre;



//Design pattern singleton

public class HorseLibrary {
	
	private ArrayList<Cheval> chevaux ;
	private ArrayList<Livre> livres ;
	private static int i = 0;
	private static HorseLibrary instance =null;
	
	
	public HorseLibrary () {
		chevaux = new  ArrayList<Cheval>();
		livres = new  ArrayList<Livre>();
	}
	
	public static HorseLibrary getInstance() {
		if(instance==null) {
			instance = new HorseLibrary();
			i=i+1;
			System.out.println(i);
		}
		return instance;
	}
	
	public void ajouterLivre(Livre livre) {
		this.livres.add(livre);
	}
	
	
	public void retireLivre(Livre livre) {
		this.livres.remove(livre);
	}



}