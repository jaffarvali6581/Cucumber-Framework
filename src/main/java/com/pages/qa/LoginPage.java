package com.pages.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	private By userName=By.name("uid");
	private By userPassword=By.name("password");
	private By loginbtn=By.name("btnLogin");
	private By logoutbtn=By.xpath("//a[text()='Log out']");
	
	public String getTitlePage() {
		return driver.getTitle();
	}
	
	public void setUserName(String uName) {
		driver.findElement(userName).sendKeys(uName);
		
	}
	public void setPassword(String uPassword) {
		driver.findElement(userPassword).sendKeys(uPassword);
	}
	public void clickLogin() {
		driver.findElement(loginbtn).click();;
	}
	public void clickLogout() {
		driver.findElement(logoutbtn).click();;
	}
	
	public Homepage doLogin(String uName,String upassword) {
		driver.findElement(userName).sendKeys(uName);;
		driver.findElement(userPassword).sendKeys(upassword);
		driver.findElement(loginbtn).click();
		return new Homepage(driver);
	}

}
