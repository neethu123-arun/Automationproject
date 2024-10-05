package Utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xl1utilities {
	public static String getCellValue(String xl,String sheet,int r,int c)
	{
		try
		{
			FileInputStream fi=new FileInputStream(xl);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			
			
			XSSFCell cell=wb.getSheet(sheet).getRow(r).getCell(c);
			if(cell.getCellType() == CellType.STRING)
			{
				return cell.getStringCellValue();
			}
			else
			{
				return cell.getRawValue();
			}
			
		}
		catch(Exception e)
		{
			return "";
		}
	}
			
	
	
			
			
		
	
public static int getRawCount(String xl,String sheet)
{
	try {
		FileInputStream fi=new FileInputStream(xl);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet(sheet);
		return wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		return 0;
	}
	}
}
