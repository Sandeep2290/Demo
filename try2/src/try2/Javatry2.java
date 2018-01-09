package try2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Javatry2 {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "E:\\Selenium\\Software\\geckodriver.exe");
		
		driver=new FirefoxDriver();
	
		driver.get("http://www.google.co.in");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.id("_fZl")).click();
		String a =driver.getCurrentUrl();
		System.out.println(a);
		//driver.close();
	}

}
