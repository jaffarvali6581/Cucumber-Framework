package StepDefination;

import org.testng.Assert;

import com.pages.qa.LoginPage;
import com.qa.Factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginSteps {
	private LoginPage lp=new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	   System.out.println("user is on login page");
	}

	@When("user user enters url {string}")
	public void user_user_enters_url(String URL) {
	    DriverFactory.getDriver().get(URL);
	}

	@And("user enters username {string} and password {string}")
	public void user_enters_username_and_password(String user, String pass) throws Exception {
	   lp.setUserName(user);
	   lp.setPassword(pass);
	   Thread.sleep(3000);
	}

	@Then("user gets the homepage title {string}")
	public void user_gets_the_homepage_title(String title1) {
	    lp.clickLogin();
	    String title=lp.getTitlePage();
	    Assert.assertTrue(title1.equals(title));
	}

	@When("user clicks the logout link")
	public void user_clicks_the_logout_link() {
	   lp.clickLogout();
	}

	@Then("user  enters gets the login page title {string}")
	public void user_enters_gets_the_login_page_title(String title2) {
	   String title=lp.getTitlePage();
	   System.out.println(title);
	}

}
