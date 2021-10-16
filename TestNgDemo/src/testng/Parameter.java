package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter
{

	@Parameters({"URL"}) 
	@Test
	public void show(String s)  
	{  
	System.out.println("Test run");  
	System.out.println(s); 
	}  
	
	
	
	
	@Parameters({"a","b"}) 
	@Test
	public void add(int c, int d)  
	{  
	int sum=c+d;  
	System.out.println("Sum of two numbers : "+sum);  
	}  
		
}

