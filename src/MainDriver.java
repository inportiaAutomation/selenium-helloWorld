

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainDriver {

	//webdriver variable
	static WebDriver driver;
	//url to open
	static String targetSite = "https://www.google.co.in";
	
	
	static void consolePrint(String d)
	{
        System.out.println(d);		
	}
	
	static void tearDown() 
	{
		// sleep for 5 sec so that browser don't close just after opening
		try {
		Thread.sleep(5000);
		}
		catch(Exception e){}
		
		//close the webdriver instance
		driver.close();
		
		//close the system properly
		System.exit(0);
	}
	
	public static void main(String[] args) {
		
		// initialize Firefox browser object 
		driver = new FirefoxDriver();
		
		//open the url site
		driver.get(targetSite);
		
		//print the title of the page and current url
		MainDriver.consolePrint(driver.getTitle());
		MainDriver.consolePrint(driver.getCurrentUrl() );
		
		// maximize the window
		driver.manage().window().maximize();
		
        
        // call the function to close everything
        MainDriver.tearDown();
	}

}
