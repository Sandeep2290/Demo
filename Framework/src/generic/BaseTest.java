package generic;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public abstract class BaseTest implements AutoConstant{
	static
	{
		System.setProperty(chromekey, chromevalue);
		System.setProperty(geckokey, geckovalue);
	}
	public WebDriver driver;//defining outside beforemethod as its implementation follows in all the methods including aftermethod and test method
	
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void beforeMethod(String browser) throws Throwable
	{if(browser.equals("chrome"))
		driver=new ChromeDriver();
	else
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
			
	}
	
	@AfterMethod(alwaysRun=true)
	public void afterMethod(ITestResult res)//Listeners in arguments
	{
		int status = res.getStatus();//returns 1 if TC is pass. Returns as 2 when status is fail
		String name = res.getMethod().getMethodName();//to retrieve the method name which runs as the actual test case so that not always override the same screenshot
		Photo.getPhoto(driver,name);
		driver.close();
	}

}
