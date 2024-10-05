package Testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass1;
import Pagepkg.Loginpage1;
import Utilities.Xlutilities;

public class Logintest1 extends Baseclass1  {
	@Test
	public void verifylogincredential() throws Exception
	{
		Loginpage1 lg=new Loginpage1(driver);
		
		//reading data from excel file
		String xl="C:\\Users\\Dell\\Desktop\\Book5.xlsx";
		String sheet="Sheet1";
		int rowcount=Xlutilities.getRawCount(xl, sheet);
		
		for(int i=1;i<=rowcount;i++)
		{
			
		String email=Xlutilities.getCellValue(xl, sheet, i, 0);
		System.out.println("email---"+email);
		
		String password=Xlutilities.getCellValue(xl, sheet,i , 1);
		System.out.println("password---"+password);
		
		//passing email and password as parameters
		lg.SetValues(email, password);
	
		//submitting the data by clicking on login button
		lg.clickloginbutton();
		
	}
	
		
	}
}
