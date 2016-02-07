

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class MainDriver {

	
	static WebDriver driver;
	static String targetSite = "https://www.google.co.in";
	
	
	static void consolePrint(String d)
	{
        System.out.println(d);		
	}
	
	static void tearDown() 
	{
		try {
		Thread.sleep(5000);
		}
		catch(Exception e){}
		
		driver.close();
		System.exit(0);
	}
	
	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get(targetSite);
		
		MainDriver.consolePrint(driver.getTitle());
		MainDriver.consolePrint(driver.getCurrentUrl() );
		
		driver.manage().window().maximize();
		
        
        
        MainDriver.tearDown();
	}

}
