package Singleton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	private static WebDriver driver; 
	
	public WebDriver setup() {
		// TODO Auto-generated constructor stub
		System.out.print("In the base constructer");
		if(driver==null)
		{
			System.out.println("driver is null "+driver);
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rajeshwari\\Downloads\\chromedriver_win32_latest\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.print("driver value "+driver);
		}
		else
		{
			System.out.print("driver is not null "+driver);
		}
		
		return driver;
			
	}
	

}
