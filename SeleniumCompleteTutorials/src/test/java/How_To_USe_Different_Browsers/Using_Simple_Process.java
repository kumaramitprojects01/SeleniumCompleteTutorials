package How_To_USe_Different_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*                                   This process involves downloading .exe driver files for each type of browser
 * Then you have to use System.setproperty()
 * 
 
 
 	 System.setProperty("webdriver.gecko.driver", pathToGeckoDriver + "\\geckodriver.exe");
		        
     //Instantiating driver object and launching browser
	
		        driver = new FirefoxDriver();
     
     //Using get() method to open a webpage
      * 
		        driver.get("https://artoftesting.com");

 */

public class Using_Simple_Process {

	public static WebDriver driver;
	public static String browser = "firefox";

	
	
	public static void main(String args[]) {
			
		if (browser.equalsIgnoreCase("chrome")) {

			 System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");	
             
			 driver=new ChromeDriver();  
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","C:\\Program Files\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		
		}

		driver.get("https://www.google.com/");

	}

}
