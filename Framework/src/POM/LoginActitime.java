package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class LoginActitime extends BasePage{
	//***creating non static elements
	@FindBy(id="username")//using @Findby method to identify and initialize objects in same statement
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;
	
	public LoginActitime(WebDriver driver) //creating a parametrized constructor with local reference variable driver
	{
		super(driver);//created super explicitly to pass driver as argument. will get value from public BasePage(WebDriver driver2) constructor in basepage
		
		PageFactory.initElements(driver, this);
		
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	public void setpassword(String pass)
	{
		this.password.sendKeys(pass);
	}
	public void loginbutton()
	{
		this.login.click();
	}

}
