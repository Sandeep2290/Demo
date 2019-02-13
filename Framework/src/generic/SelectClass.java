package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	public static void selectByVal(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}

}
