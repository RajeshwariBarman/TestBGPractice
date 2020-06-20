package Framework;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParms {
		
	@Parameters("testdata")
	@Test
	private void add(String name )
	{
		Date d = new Date();
		System.out.println("Date "+d);
		System.out.println("Name "+name);
		System.out.println(" in add");
	}
	
	@Parameters("testdata1")
	@Test
	void add1(String name )
	{
		Date d = new Date();
		System.out.println("Date "+d);
		System.out.println("Name "+name);
		System.out.println("in add1");
	}
}
