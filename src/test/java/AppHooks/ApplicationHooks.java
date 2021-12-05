package AppHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.Factory.DriverFactory;
import com.qa.utils.ReadConfig;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {

	private DriverFactory driverfactory;
	private WebDriver driver;
	private ReadConfig configreader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		configreader=new ReadConfig();
		prop=configreader.initial_prop();
	}
	@Before(order=1)
	public void launchBrowser() {
		String browserName=prop.getProperty("browser");
		driverfactory=new DriverFactory();
		driver=driverfactory.initialize_driver(browserName);
	}
	@After(order=0)
	public void quitbrowser() {
		driver.quit();
	}
	@After(order=1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenshotname=scenario.getName().replaceAll(" ", "_");
			byte [] sourcepath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath, "image/png", screenshotname);
		}
	}
}
