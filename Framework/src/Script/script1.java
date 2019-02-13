package Script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.LoginActitime;
import generic.BaseTest;
import generic.input;

public class script1 extends BaseTest{
	
@Test(priority=1)
	public void test123()
	
	{  	LoginActitime ob=new LoginActitime(driver);		
		ob.setusername(input.getData(excelPath, "sheet1", 0, 1));
		ob.setpassword(input.getData(excelPath, "sheet1", 1, 1));
		ob.loginbutton();
		ob.titlewait("Enter");
		
	}

}
/*LA--extends--BP
s1(creates object of constructor LA)--extends--BT(also calls getphoto method)--implements--AC
*/