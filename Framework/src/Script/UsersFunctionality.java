package Script;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.HomePageActitime;
import POM.LoginActitime;
import generic.BaseTest;
import generic.input;

public class UsersFunctionality extends BaseTest{
	
@Test()
	public void userbuttonTest() 
	{
		HomePageActitime hp=new HomePageActitime(driver);
		hp.setUsersclick();
	}
	

}
