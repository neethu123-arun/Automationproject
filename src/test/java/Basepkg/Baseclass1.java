package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass1 {
	public static WebDriver driver;
	@BeforeClass
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		driver.manage().window().maximize();
	}

}

