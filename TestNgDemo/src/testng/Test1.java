package testng;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void demo()
	{
		System.out.println("DEMO 1st class");
	}
	
	@Test(groups="smoke")
	public void login()
	{
		System.out.println("Login method");
	}

	@Test(groups="smoke")
	public void logout()
	{
		System.out.println("Logout method");
	}
	
}
