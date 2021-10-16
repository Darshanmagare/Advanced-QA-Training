package testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumMultiBrowserProgram 
{
	
	public WebDriver driver;
	

	@Parameters({"browsername"}) 
	@BeforeClass
	public void show(String browsername)  
	{  
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\darsh\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		
		}
		else if(browsername.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\darsh\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
			driver.get("http://www.google.com");
			
	}
		
		@Test
		public void test() throws InterruptedException
		{
			driver.findElement(By.linkText("Gmail")).click();
			Thread.sleep(1000);
			
		}
		
		@AfterClass
		public void windowexit()
		{
			driver.quit();
		}
		
}  
	


