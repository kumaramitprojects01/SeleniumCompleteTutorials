package com.SeleniumCompleteTutorials.qa.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_PartialLinkText {
	
	public static WebDriver driver;
	
public static void main(String args[]) {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/test/link.html");

	WebElement helpLink = driver.findElement(By.partialLinkText("click "));    // Here we do not have to give the entire text

	helpLink.click();
	
	
	
	
}

}
