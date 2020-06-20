package Framework;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TestDataprovider {
	
//	@BeforeSuite
//	void beforesuite()
//	{
//		Assert.fail();
//		System.out.println("In the suite method ");
//	}
//	
	static
	{
		System.out.println("In the test static block");
	}
	
	
	{
		System.out.println("In the test instance block");
	}
	private TestDataprovider() {
		// TODO Auto-generated constructor stub
		System.out.println("In the test constructor");
	}
	
	@BeforeMethod
	void beforemethod()
	{
//		Assert.fail();
		System.out.println("In the Before1 method ");
	}
//	
//	@BeforeTest
//	void beforetest()
//	{
//		System.out.println("In the Before Test ");
//	}
//	
//	@BeforeGroups
//	void beforegroups()
//	{
//		System.out.println("In the Before Groups");
//	}
//	
//	@BeforeClass
//	void beforeclass()
//	{
//		
//		System.out.println("In the Before class ");
//	}
//	
//	@Test(dataProviderClass = DataUtil.class , dataProvider = "test123")
//	void TestDataprovider7(String name)
//	{
//		System.out.println("in the testdataprovider");
//	}
//	
//	
//	@Test(dataProvider = "test12", dataProviderClass = DataUtil.class )
//	void testdataprovider1(String name)
//	{
//		System.out.println("in the testdataprovider1");
//	}
	
	@Test(dataProvider = "getdata"  , groups = "abc")
	private void testdataprovider2(String name)
	{
		System.out.println("in the testdataprovider2 testcase " +name);
	}
	
//	@Test(dataProvider = "getdata1" )
//	void testdataprovider3(String name)
//	{
//		System.out.println("in the testdataprovider3");
//	}
	
	@DataProvider
	public Object[] getdata(Method m)
	{
		System.out.println("Hello world in get data provider");
		System.out.println("Method Called for DP = "+m);
		Object[] data = new Object[2];
		data[0] = "raj";
		data[1] = "barman";
		return data;
	}
	
	@DataProvider
	public Object[] getdata1()
	{
		System.out.println("Hello world in get data1");
		Object[] data = new Object[1];
		data[0] = "raj";
		return data;
	}
	
	@Test(dataProvider = "data1", dataProviderClass = DPexecutionorderTest.class )
	void test(String name)
	{
			
	}

}
