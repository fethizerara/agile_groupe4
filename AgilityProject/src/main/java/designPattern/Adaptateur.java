package designPattern;

import java.util.ArrayList;
import java.util.List;

import Cheval.Cheval;
import gestionLivre.Auteur;
import gestionLivre.Livre;

public class Adaptateur extends Auteur{
    private Cheval cheval;
    
    public Adaptateur(Cheval cheval) {
    	this.cheval = cheval;
    }
    
    public void saccagerLivres() {
        List<Livre> livres = new ArrayList<Livre>();
    	this.setLivres(livres);
    }
    
}
