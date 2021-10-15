package objectRepository;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class signinmoney {
		
		WebDriver localdriver;


		public signinmoney(WebDriver driver)
		{
			this.localdriver = driver;
			
		}
		
		@FindBy(linkText="Terms")
		public WebElement linkTerms;
		

		
		public void clickTerms() {
			linkTerms.click();
		}
		
	

	}

