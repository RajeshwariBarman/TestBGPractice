package Framework;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataUtil {
	
	@DataProvider(name = "test123")
	private Object[] getdata7(Method m)
	{
		System.out.println("Hello world in get data from datautil class");
		System.out.println("TEST NAME = "+m.getName());
		Object[] data = new Object[1];
		data[0] = "raj";
		return data;
	}
	
	@DataProvider(name = "test12")
	public static Object[] getdata1()
	{
		System.out.println("Hello world in get data1 rom datautil class");
		Object[] data = new Object[1];
		data[0] = "raj";
		return data;
	}

}
