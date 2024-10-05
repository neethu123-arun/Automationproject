package Pagepkg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class Homepage1 {
	WebDriver driver;
	//Locating gear
	@FindBy(xpath="//*[@id=\"ui-id-6\"]/span[2]")
	WebElement Gear;
	
	//Locating watches
	@FindBy(xpath="//*[@id=\"ui-id-27\"]/span")
	WebElement Watches;
	
	//@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[4]/div/a/span/span/img")
	//WebElement image;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/div[3]/div/div[1]/form/button/span")
	WebElement Addtocart;
	
	//@FindBy(xpath="//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/div/div[3]/div/div[1]/form/button/span")
	//List<WebElement> addtocartlist;
	
	public Homepage1(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this) ;
		
	}
	
	public void mousehoveraction()
	{
		Actions act=new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		act.moveToElement(Gear).perform();
	}
		
	
	public void clickwatches()
	{
		Watches.click();
		
	}
	/*public void mousehoveraction1()
	{
		Actions act1=new Actions(driver);
		act1.moveToElement(image).perform();
	}*/
	
	
		
	
	public void addtocart() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//List<WebElement> addtocartlist=	driver.findElements(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[6]/div/div/div[3]/div/div[1]/form/button/span"));
		//System.out.println(addtocartlist.size());
		//for (WebElement oneproduct:addtocartlist) {
			//oneproduct.click();
		Addtocart.click();
		}
	    
		}
		
	
	

 



