package Framework;

import org.testng.annotations.Test;

public class ThreadpoolTest {
	
	@Test()
	private void test1()
	{
		
		System.out.println("in test 1 CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	@Test(threadPoolSize = 3 , invocationCount = 6)
	private void test2()
	{
		
		
		System.out.println("in test 2 CURRENT THREAD ="+Thread.currentThread().getId());
	}
	
	
	

}
