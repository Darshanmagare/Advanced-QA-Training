package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertequal {
	
	@Test
	public void Assert()
	{
	String act = "Gooooogle - Wrong string";
	System.out.println("Below assert would fail - ");
	Assert.assertEquals(act, "Google");
	}
}
