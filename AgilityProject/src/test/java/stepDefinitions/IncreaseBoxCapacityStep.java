package stepDefinitions;
import org.junit.Assert;

import Cheval.Box;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class IncreaseBoxCapacityStep {
	Box box;
	@Given("Une box et sa capacité de base {int}")
	public void une_box_et_sa_nouvelle(int capacity) {
	    box = new Box();
	    box.setCapacity(capacity);
	}

	@When("on souhaite augmenter la nouvelle {int}")
	public void on_souhaite_augmenter_la_nouvelle_capacité(int newCapacity) {
	    box.setCapacity(newCapacity);
	}

	@Then("la nouvelle box a une capacité supérieure")
	public void la_nouvelle_box_a_une() {
	    Assert.assertEquals(20, box.getCapacity());
	}

}