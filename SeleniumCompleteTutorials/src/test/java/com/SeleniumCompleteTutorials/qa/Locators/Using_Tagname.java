package com.SeleniumCompleteTutorials.qa.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_Tagname {
	// Print all links of a Page

	// NOTE: All links have one thing in common i.e. TAGNAME --> a

	public static WebDriver driver;

	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.sugarcrm.com/request-demo/");

		List<WebElement> alltags = driver.findElements(By.tagName("a"));

		System.out.println("\nNumber of tags =" + alltags.size());

		for (int i = 0; i < alltags.size(); i++) {
			System.out.println("\nLink[+" + i + "] :" + alltags.get(i).getAttribute("href"));
		}

	}

}
