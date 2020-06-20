package Framework;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

	
	
	@BeforeSuite
	void setup()
	{
		System.out.println("In the before setup");
	}
	
	@AfterSuite
	void teardown()
	{
		System.out.println("In the after setup");
	}
}
