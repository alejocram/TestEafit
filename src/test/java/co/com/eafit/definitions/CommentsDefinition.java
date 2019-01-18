package co.com.eafit.definitions;

import co.com.eafit.steps.CommentsStep;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CommentsDefinition {
	@Steps
	private CommentsStep commentsStep;
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		commentsStep.loadURL();
	}


	@When("^el envia el comentario$")
	public void elEnviaElComentario(DataTable dtTable) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		commentsStep.fillComment(dtTable);
	}

	@Then("^el visualiza el pantalla el mensaje \"([^\"]*)\"$")
	public void elVisualizaElPantallaElMensaje(String message) throws Exception {
		commentsStep.assertSuccess(message);
	}

}
