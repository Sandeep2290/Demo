package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class HomePageActitime extends BasePage{
	@FindBy(xpath="'//div[contains(text(),'USERS')]')")
	private WebElement users;
	
	public HomePageActitime(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void setUsersclick()
	{
		this.users.click();
	}

}
