package com.SeleniumCompleteTutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prg1_How_To_Use_Browsers_In_Selenium {

	
	public static WebDriver driver=null;
	public static String  browser="edge";
	// Way1: Using the reference to each browser's driver file

	//Way 1
	
	public static void main(String args[])
	{
		
	if(browser.equalsIgnoreCase("firefox"))	   // GeckoDriver---> For FireFox
	    {
		   System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
	       driver = new FirefoxDriver();
	    }
	
	else if(browser.equalsIgnoreCase("chrome"))     // ChromeDriver---> For Chrome
	    {
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	       driver = new ChromeDriver();
      	}  
	
	else if(browser.equalsIgnoreCase("edge"))     //  Edge Driver----> For Edge
	    {
	        System.setProperty("webdriver.edge.driver","C:\\Program Files\\edgedriver_win64\\msedgedriver.exe");
	        driver = new EdgeDriver();
	    }
	
	
	
	
	
	
	
	// Way 2:  Using WebDriverManager Dependency
	/*
	public static void main(String args[])
	{
		
	  if(browser.equalsIgnoreCase("firefox"))	   // GeckoDriver---> For FireFox
	    {
	    	WebDriverManager.firefoxdriver().setup();
	        driver = new FirefoxDriver();
	    }
	
	else if(browser.equalsIgnoreCase("chrome"))     // ChromeDriver---> For Chrome
	    {
		    WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
      	}  
	
	else if(browser.equalsIgnoreCase("edge"))     //  Edge Driver----> For Edge
	    {
	     	 WebDriverManager.edgedriver().setup();
	        driver = new EdgeDriver();
	    }
	  */
	
	  driver.get("https://www.google.com/");
	
	}
	
	
	
}
