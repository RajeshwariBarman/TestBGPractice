package Singleton;

import org.testng.annotations.Test;

public class Testclass1 extends Testbase {
	
	@Test
	void test1()
	{
		System.out.println("IN the test1");
		System.out.println("driver value in test 1 = "+ setup());
	}
	
	@Test
	void test3()
	{
		System.out.println("IN the test3");
		System.out.println("driver value in test 3 = "+ setup());
	}

}
