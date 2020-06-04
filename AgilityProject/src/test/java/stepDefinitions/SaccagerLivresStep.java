package stepDefinitions;

import org.junit.Assert;

import Cheval.Cheval;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import designPattern.Adaptateur;
import gestionLivre.Auteur;
import gestionLivre.Livre;


public class SaccagerLivresStep {
	private Livre livreToAdd; 
	private Livre livreToAdd2;
	private Cheval cheval = new Cheval (5, 18);
	private Adaptateur chevalAuteur;


	@Given("Un cheval")
	public void un_cheval() {
	    chevalAuteur = new Adaptateur(cheval);
	}

	

	@Given("deux livres de {string} et {string} et leurs {double} {double}")
	public void deux_livres_de_et_et_leurs(String titre1, String titre2, double prix1, double prix2) {
		livreToAdd = new Livre(titre1, prix1);
		livreToAdd2 = new Livre(titre2, prix2);
		chevalAuteur.addLivre(livreToAdd);
		chevalAuteur.addLivre(livreToAdd2);
	}

	@When("le cheval saccage ses livres")
	public void le_cheval_saccage_ses_livres() {
		chevalAuteur.saccagerLivres();
	}

	
	
	@Then("le nombre de livres est de {int}")
	public void le_nombre_de_livres_est_de(int nbLivres) {
		Assert.assertEquals(chevalAuteur.getLivres().size(), nbLivres);
	}
	
	
}

