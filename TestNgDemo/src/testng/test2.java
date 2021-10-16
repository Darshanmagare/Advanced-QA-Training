package testng;

import org.testng.annotations.Test;

public class test2 {

	@Test
	public void demo()
	{
		System.out.println("DEMO 2nd Class");
	}
	
	@Test(dependsOnMethods= {"bmethod","cmethod"})
	public void amethod()
	{
		System.out.println("A Method");
	}
	
	@Test
	public void bmethod()
	{
		System.out.println("B Method");
	}
	
	@Test
	public void cmethod()
	{
		System.out.println("C method");
	}
	
	
	
	
}
