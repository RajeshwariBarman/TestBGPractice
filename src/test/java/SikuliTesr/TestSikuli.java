package SikuliTesr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class TestSikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajeshwari\\Downloads\\chromedriver_win32_latest\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hackerrank.com/dashboard");
		
		
		driver.findElement(By.xpath("//button[contains(@class,'login pull-right')]")).click();
		
		driver.findElement(By.name("username")).sendKeys("raajeshwaribarman@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Raj123.");
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		Thread.sleep(5000);
		Screen  s=new Screen();
		Pattern pause=new Pattern("C:\\Users\\Rajeshwari\\Downloads\\pic.png");
		s.wait(pause, 4000);
		s.click();
	}

}
