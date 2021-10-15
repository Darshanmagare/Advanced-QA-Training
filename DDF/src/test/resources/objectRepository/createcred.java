package objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class createcred {
	

	WebDriver localdriver;
	public createcred(WebDriver driver)
	{
		this.localdriver = driver;
	}

	//@FindBy(xpath="//a[contains(text(),'Sign In')]")
	//public WebElement signinbutton;
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement userpassword;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submit;
	
	/*public Signin_Unable_page clickNext1() {
		signinbutton.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		Signin_Unable_page signinunable = new Signin_Unable_page(localdriver);
		PageFactory.initElements(localdriver, signinunable);
		return signinunable;
	}*/
	
	
	public void enteremailid( String emailid) {
		email.sendKeys(emailid);
	}
	
	public void enterpass( String pass) {
		userpassword.sendKeys(pass);
	}
	
	public void elementClick()
	{
		submit.click();
	}
	
	
	/*public Signin_Unable_page clickNext() {
		submit.click();
		
		//Signin_pwd_page signinpwd = new Signin_pwd_page(localdriver);
		Signin_Unable_page signinunable = new Signin_Unable_page(localdriver);
		PageFactory.initElements(localdriver, signinunable);
		return signinunable;
	}*/

}

