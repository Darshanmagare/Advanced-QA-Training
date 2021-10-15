package pageobjectmodel;
import objectRepository.createcred;
import objectRepository.moneyrediffsignin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginmoneyrediff {
	

@Test
public void Login() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\darsh\\Downloads\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://money.rediff.com/index.html");
	Thread.sleep(3000);
	
	moneyrediffsignin signinpage=new moneyrediffsignin(driver);
	
	PageFactory.initElements(driver, signinpage);
	
	signinpage.elementClicksignin();
	Thread.sleep(5000);
	
	createcred cred=new createcred(driver);
	PageFactory.initElements(driver, cred);
	
	cred.enteremailid("mrdarshan1997@rediffmail.com");
	cred.enterpass("Omsai@5115");
	
	cred.elementClick();
	
	
	Thread.sleep(5000);
	//signinunable.clickTerms();

	System.out.println("End of code");
	
}
}