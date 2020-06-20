package Framework;

import org.testng.annotations.Test;

public class ThreadpoolTest {
	
	int var = 30;
	@Test()
	private void test1()
	{
		
		System.out.println("in test 1 CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test(threadPoolSize = 3 , invocationCount = 6)
	private void test2()
	{
		
		System.out.println("Hello Worlds");
		System.out.println("in test 2 CURRENT THREAD ="+Thread.currentThread().getId());
	}	
	
		
	@Test()
	private void test3()
	{
		
		System.out.println("in test 3 CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test()
	private void test4()
	{
		
		System.out.println("in test 4 CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test()
	private void test5()
	{
		
		System.out.println("in test 5 CURRENT THREAD ="+Thread.currentThread().getId());
	}
		
	
	
	

}
