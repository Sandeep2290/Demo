package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsTaken {
	
	public static void doubleclk(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.doubleClick(target);
	}
	public static void contextclk(WebDriver driver,WebElement target)
	{
		Actions a=new Actions(driver);
		a.contextClick(target);
	}

}
