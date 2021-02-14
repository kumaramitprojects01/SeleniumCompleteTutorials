package How_To_USe_Different_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* 
Step 1: Add WebDriverManager dependency to pom.xml


     <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>                                                                                                                                         
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>4.3.1</version>
</dependency>
 
 
 
 
Step 2:use WebDriverManager.bro_name.setup();

 */


public class Using_WebDriver_Manager_Dependency {
	
	public static WebDriver driver;
	public static String browser="chrome";
	
	
	
	public static void main(String args[])
	{
		if(browser.equalsIgnoreCase("chrome")) {
		
			WebDriverManager.chromedriver().setup();
		    
			driver=new ChromeDriver();
		
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver=new FirefoxDriver();
		}
		
		
		driver.get("https://www.google.com/");
		
		
		
		
	}

}
