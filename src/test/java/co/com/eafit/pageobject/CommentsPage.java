package co.com.eafit.pageobject;

import static org.junit.Assert.assertThat;

import java.util.List;

import org.hamcrest.Matchers;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class CommentsPage extends PageObject{
	@FindBy(id="Field1")
	public WebElementFacade txtName;
	@FindBy(id="Field3")
	public WebElementFacade txtEmail;
	@FindBy(id="Field4")
	public WebElementFacade txtPhonenumber;
	@FindBy(id="Field5")
	public WebElementFacade txtCity;
	@FindBy(id="Field6")
	public WebElementFacade txtComment;
	@FindBy(id="saveForm")
	public WebElementFacade btnSend;
	@FindBy(xpath="//*[@id=\"container\"]/form/h2")
	public WebElementFacade lblMessage;
	
	public void setDataToForm(DataTable dtTable) {
		//Se debe de indicar pues la pagina tiene un frameset
		getDriver().switchTo().frame(0);
		
		List<List<String>> commentList = dtTable.raw();
		txtName.sendKeys(commentList.get(1).get(0));
		txtEmail.sendKeys(commentList.get(1).get(1));
		txtPhonenumber.sendKeys(commentList.get(1).get(2));
		txtCity.sendKeys(commentList.get(1).get(3));
		txtComment.sendKeys(commentList.get(1).get(4));
		btnSend.click();
	}

	public void assertSuccess(String message) {
		assertThat(message, Matchers.containsString(lblMessage.getText()));
	}
}
