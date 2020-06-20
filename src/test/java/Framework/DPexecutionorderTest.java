package Framework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DPexecutionorderTest {
	
	
	
	static
	{
		System.out.println("In the dp static block");
	}
	{
		System.out.println("In the dp instance block");
	}
	
	public DPexecutionorderTest()
	{
		System.out.println("In the dp1222");
	}
	
	@BeforeSuite
	private void beforesuite()
	{
//		Assert.fail();
		System.out.println("In the suite method ");
	}
	
	@BeforeMethod
	void beforemethod()
	{
//		Assert.fail();
		System.out.println("In the Before method ");
	}
	
	@AfterMethod
	void Afteremethod()
	{
//		Assert.fail();
		System.out.println("In the After method ");
	}
	
	@Test
	void test()
	{
		System.out.println("In the test2  method ");
	}
	
	@BeforeTest
	void beforetest()
	{
//		Assert.fail();
		System.out.println("In the Before Test ");
	}
	
	@BeforeGroups
	void beforegroups()
	{
		System.out.println("In the Before Groups");
	}
	
	@BeforeClass
	void beforeclass()
	{
		
		System.out.println("In the Before class ");
	}
	

	@DataProvider
	private Object[] data1()
	{
		System.out.println("Hello world in DATA");
//		Assert.fail();
		Object[] data = new Object[1];
		data[0] = "raj";
		return data;
	}
	

}
