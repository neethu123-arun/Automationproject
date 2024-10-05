package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage1 {
	WebDriver driver;
	//Locating email text box
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement emailfield;
	
	//Locating password text box
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement passwordfield;
	
	//Locating login button
	@FindBy(xpath="//*[@id=\"send2\"]/span")
	WebElement loginbutton;
	
	public Loginpage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this) ;
		
	}
	
	//specifying email and password
	
public void SetValues(String email,String password) 
{
	emailfield.clear();
	emailfield.sendKeys(email);
	passwordfield.clear();
	passwordfield.sendKeys(password);
	
}


//clicking on login button

public void clickloginbutton()
{
	loginbutton.click();
	
	}


}

