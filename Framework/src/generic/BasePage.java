package generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {//whatever condition you want to check needs to be placed in basepage as a method
	public WebDriver driver;
	
	public BasePage(WebDriver driver2) //constructor got created automatically when we choose select option in the advice in super statement in POM class
	{
		this.driver=driver2;
	}
	public void titlewait(String title)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.titleContains(title));
		Reporter.log("Title is Matching",true);
		}
		catch(Exception e)
		{
			Reporter.log("Title is not Matching",true);
			Assert.fail();
		}
	}
	public void elementVisibility(WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try{
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("Element is visible",true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not visible",true);
			Assert.fail();
		}
	}

}
