package stepDefinitions;
import org.junit.Assert;

import Cheval.Box;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import designPattern.HorseLibrary;

public class fromBoxToLibraryStep {
	HorseLibrary horseLibrary;
	String msgErreur = "";
	
	@Given("une HorseLibrary")
	public void une_HorseLibrary() {
		horseLibrary = new HorseLibrary(); 
	}

	@When("on crée une deuxième HorseLibrary")
	public void on_crée_une_deuxième_HorseLibrary() {
		HorseLibrary horseLibrary2 = new HorseLibrary();
		if(horseLibrary2.getInstance() == horseLibrary.getInstance())
			msgErreur = "existe déjà";
	}

	@Then("l'application nous renvoie un {string}")
	public void l_application_nous_renvoie_un(String messageErreur) {
	    Assert.assertEquals(messageErreur, msgErreur);
	}

}
