package generic;

public interface AutoConstant //by default, all defined values are static and final. So we are using interface and not class
{
	String chromekey="webdriver.chrome.driver";
	String chromevalue="./Drivers/chromedriver.exe";
	//String chromevalue="./Driver/chromedriver.exe";
	String geckokey="webdriver.gecko.driver";
	String geckovalue="./Driver/geckodriver.exe";
	String excelPath="./Excel/input.xlsx";
	String url="https://demo.actitime.com/login.do";

}
