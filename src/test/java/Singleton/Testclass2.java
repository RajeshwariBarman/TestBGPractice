package Singleton;

import org.testng.annotations.Test;

public class Testclass2 extends Testbase{

	@Test
	void test2()
	{
		System.out.println("IN the test2");
		System.out.println("driver value in test 2 = "+ setup());
	}
}
