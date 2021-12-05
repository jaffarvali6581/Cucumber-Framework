package StepDefination;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pages.qa.Homepage;
import com.pages.qa.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class homepageSteps {
	private LoginPage lp=new LoginPage(DriverFactory.getDriver());
	private Homepage hp;
	@Given("user already logged in to application")
	public void user_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String, String>> listElement=dataTable.asMaps();
		String userName=listElement.get(0).get("userName");
		String password=listElement.get(0).get("password");
		DriverFactory.getDriver().get("http://demo.guru99.com/V4/");
	    hp=lp.doLogin(userName, password);
	}

	@Given("user is on homepage")
	public void user_is_on_homepage() {
	    System.out.println("user is on homepage");
	}

	@When("user gets the homepage title")
	public void user_gets_the_homepage_title() {
	   String tit=hp.getTitle2();
	   System.out.println(tit);
	}

	@Then("page title should be{string}")
	public void page_title_should_be(String string) {
	    Assert.assertTrue(true);
	}

	@When("user click the tours section")
	public void user_click_the_tours_section() {
	   hp.clickOnToursPage();
	}

	@Then("tile of tours page section is {string}")
	public void tile_of_tours_page_section_is(String string) {
	   String tourtit=hp.getTitle2();
	   Assert.assertTrue(tourtit.equals(string));
	}


}
