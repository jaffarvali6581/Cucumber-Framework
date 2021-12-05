package com.pages.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {

	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnToursPage() {
		driver.findElement(By.xpath("//a[text()='New Tours']")).click();
	}
	public String getTitle2() {
		return driver.getTitle();
	}
}
