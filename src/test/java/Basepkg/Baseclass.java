package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
	public static WebDriver driver;
	@BeforeClass
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/login?returnurl=%2F");
		driver.manage().window().maximize();
	}

}


