package com.qa.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tldriver=new ThreadLocal<>();

	public WebDriver initialize_driver(String browser) {
		if(browser.equals("chrome")) {
			tldriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			tldriver.set(new FirefoxDriver());
		}
		return getDriver();
		
	}
	public static synchronized WebDriver getDriver() {
		return tldriver.get();
	}
}
