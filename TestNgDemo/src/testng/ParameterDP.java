package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterDP
{

	@Test(dataProvider="SearchProvider")
	public void testMethod(String name,String state)throws InterruptedException
	{
	
		{
		System.out.println("Welcome -> "+name + "He is from ->"+state);
		Thread.sleep(1000);
		}
	
	}
	

@DataProvider(name="SearchProvider")
public Object[][] getDataFromDataprovider()
{
	return new Object[][]
			{
				{"Pankaj","UttarPradesh"},
				{"Sree Vatsa","Karnataka"},
				{"Neeraj", "Gujrat"}
				
					
			};
		
			
}
}

