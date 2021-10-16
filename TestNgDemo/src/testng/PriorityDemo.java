package testng;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	@Test
	public void Addcust()
	{
		System.out.println("Add Details");
	}

	@Test(priority=2)
	public void Editcust()
	{
		System.out.println("Edit Customer Details");
	}
	
	@Test(priority=1)
	public void Deletecust()
	{
		System.out.println("Delete Customer");
	}
	

}
