package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class moneyrediffsignin {
	
	WebDriver localdriver;
	public moneyrediffsignin(WebDriver driver)
	{
		this.localdriver = driver;
	}

	@FindBy(xpath="//a[contains(text(),'Sign In')]")
	public WebElement signinbutton;
	
	public void elementClicksignin()
	{
		signinbutton.click();
	}

}
