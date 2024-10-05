package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass1;
import Pagepkg.Homepage1;


public class Hometest1 extends Baseclass1 {
	@Test
	public void verifyhomepageelements() throws Exception
	{
		Homepage1 hp=new Homepage1(driver);
		hp.mousehoveraction();
		hp.clickwatches();
		hp.addtocart();
		
		
		
	
		
		
	}


}
