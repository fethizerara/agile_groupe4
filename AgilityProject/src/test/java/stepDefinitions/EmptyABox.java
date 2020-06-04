package stepDefinitions;

import org.junit.Assert;

import Cheval.Box;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmptyABox {
	Box box;
	@Given("A box with {int} and {int}")
	public void a_box_with_and(int numero, int capacity) {
	    box = new Box();
	    box.setCapacity(numero);
	    box.setNumero(numero);
	}

	@When("An user empties the box")
	public void an_user_empties_the_box() {
		 box.getChevaux().removeAll(box.getChevaux()); 
	}

	@Then("Application returns {string}")
	public void application_returns(String feedback) {
		String s = "";
		if(box.getChevaux().size() == 0)
			s = "Le box vient d'être vidée";
	    Assert.assertEquals(feedback, s);
	}
}
