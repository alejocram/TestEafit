package co.com.eafit.steps;

import co.com.eafit.pageobject.CommentsPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class CommentsStep {
	private CommentsPage commentsPage;
	
	@Step
	public void loadURL() {
		commentsPage.open();
	}

	public void fillComment(DataTable dtTable) {
		commentsPage.setDataToForm(dtTable);
	}

	public void assertSuccess(String message) {
		commentsPage.assertSuccess(message);
	}
}
