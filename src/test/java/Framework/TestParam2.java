package Framework;

import java.lang.reflect.Method;
import java.util.Date;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParam2 {
	
	public TestParam2() {
		// TODO Auto-generated constructor stub
		System.out.println("In the constructer");
		testin();
	}
	
//	@BeforeClass
//	void EX1(Method m)
//	{
//		testin();
//		System.out.println("in the before class");
//		System.out.println("CURRENT THREAD ="+Thread.currentThread().getId());
//		
//	}
	
	@Test()
	private void testin()
	{
		System.out.println("In the TESTing");
		
		System.out.println("CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test(threadPoolSize = 3 , invocationCount = 2)
	private void testin1()
	{
		System.out.println("thread pool");
		System.out.println("CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test
	private void testin2()
	{
		System.out.println("In the TESTing");
		System.out.println("CURRENT THREAD ="+Thread.currentThread().getId());
		
	}
	
	@BeforeMethod
	void exe(Method m)
	{
		testin();
		System.out.println("In the befor ="+m.getAnnotation(Test.class).description());
		
	}
	
	@Parameters("testdata1")
	@Test(dataProvider = "getdata" , description = "this is the description of test")
	void add1(String name , Method m)
	{
		Date d = new Date();
		System.out.println("Date "+d);
		System.out.println("Name "+name);
		System.out.println("In testparam2 ");
		System.out.println("In the test case ="+m.getAnnotation(Test.class).description());
		System.out.println("CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@DataProvider
	public Object[] getdata()
	{
		System.out.println("Hello world in get data");
		Object[] data = new Object[1];
		data[0] = "raj";
		return data;
	}

}
